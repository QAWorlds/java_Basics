package interview;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ramyadreebogi";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}


//  Explanation:
//We use StringBuilder.reverse() to reverse the string efficiently.