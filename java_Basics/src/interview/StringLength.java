package interview;

public class StringLength {
    public static void main(String[] args) {
        String str = "hello";
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
            
        }
        
        System.out.println("Length: " + length);
    }
}


//Convert the string to a character array and count manually.