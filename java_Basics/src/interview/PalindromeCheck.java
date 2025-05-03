package interview;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}


//Explanation:
//If the original string is equal to its reversed version, it’s a palindrome.

//