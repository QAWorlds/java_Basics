import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class FinalPieChart extends JPanel {

    private static final int[] data = {70, 20, 10};  // Pass, Fail, Skip
    private static final Color[] colors = {
            new Color(244, 67, 54),   // Fail - Red
            new Color(255, 152, 0),   // Skip - Orange
            new Color(76, 175, 80)    // Pass - Green
    };
    private static final String[] labels = {"Fail", "Skip", "Pass"};

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawPie((Graphics2D) g, getBounds(), data, colors, labels);
    }

    private void drawPie(Graphics2D g, Rectangle area, int[] data, Color[] colors, String[] labels) {
        int total = 0;
        for (int value : data) {
            total += value;
        }

        int centerX = area.x + area.width / 2;
        int centerY = area.y + area.height / 2 - 30;

        int pieDiameter = 300;
        int pieX = centerX - pieDiameter / 2;
        int pieY = centerY - pieDiameter / 2;

        int startAngle = 0;

        // Anti-aliasing for smooth lines
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the pie slices
        for (int i = 0; i < data.length; i++) {
            int arcAngle = (int) Math.round((data[i] * 360.0) / total);
            g.setColor(colors[i]);
            g.fillArc(pieX, pieY, pieDiameter, pieDiameter, startAngle, arcAngle);

            // Calculate middle angle for label line positioning
            double theta = Math.toRadians(startAngle + arcAngle / 2.0);
            int lineStartX = (int) (centerX + Math.cos(theta) * pieDiameter / 2);
            int lineStartY = (int) (centerY + Math.sin(theta) * pieDiameter / 2);

            int lineEndX = (int) (centerX + Math.cos(theta) * (pieDiameter / 2 + 30));
            int lineEndY = (int) (centerY + Math.sin(theta) * (pieDiameter / 2 + 30));

            // Draw connector line
            g.setColor(Color.DARK_GRAY);
            g.drawLine(lineStartX, lineStartY, lineEndX, lineEndY);

            // Draw small circle (dot)
            int dotSize = 6;
            g.fill(new Ellipse2D.Double(lineEndX - dotSize / 2, lineEndY - dotSize / 2, dotSize, dotSize));

            // Draw label text beside dot
            g.setFont(new Font("SansSerif", Font.PLAIN, 14));
            int labelOffset = 10;
            g.drawString(labels[i] + " (" + data[i] + "%)", lineEndX + labelOffset, lineEndY + 5);

            startAngle += arcAngle;
        }

        // Draw the legend box under pie chart
        int legendY = pieY + pieDiameter + 50;
        int legendXStart = centerX - 100;
        int boxSize = 12;
        int gap = 80;

        g.setFont(new Font("SansSerif", Font.PLAIN, 14));
        for (int i = 0; i < labels.length; i++) {
            int x = legendXStart + i * gap;

            // Draw color circle
            g.setColor(colors[i]);
            g.fillOval(x, legendY, boxSize, boxSize);

            // Draw label text
            g.setColor(Color.DARK_GRAY);
            g.drawString(labels[i], x + boxSize + 5, legendY + boxSize - 1);
        }

        // Draw chart title
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("SansSerif", Font.PLAIN, 18));
        g.drawString("Automation Execution", centerX - 80, pieY - 20);
    }

    private static void saveAsImage(JPanel panel, String filename) {
        int width = panel.getWidth();
        int height = panel.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        panel.paint(g2);
        g2.dispose();

        try {
            ImageIO.write(image, "png", new File(filename));
            System.out.println("Chart saved as: " + filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Automation Execution Pie Chart");
        FinalPieChart chartPanel = new FinalPieChart();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Save the pie chart as an image after it's visible
        SwingUtilities.invokeLater(() -> saveAsImage(chartPanel, "D:/oxo/AutomationExecutionPieChart.png"));
    }
}
