package interview;

public class DigitSum {
    public static void main(String[] args) {
        int num = 1234, sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Digit Sum: " + sum);
    }
}


//Extract each digit using % 10 and add it to the sum. Then divide the number by 10 to move to the next digit.