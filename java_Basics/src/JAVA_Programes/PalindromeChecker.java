package JAVA_Programes;

import java.util.Scanner;

public class PalindromeChecker {

    public static void name (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("RAVA");
        String original = scanner.nextLine();

        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("✅ It's a palindrome!"+original);
        } else {
            System.out.println("❌ Not a palindrome.");
        }

        scanner.close();
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int reversed = 100;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println("✅ It's a palindrome number!");
        } else {
            System.out.println("❌ Not a palindrome number.");
        }

        scanner.close();
    }
    
    
    
    
    
    
}
