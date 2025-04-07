package strings;
public class testcase1 {
    public static void main(String[] args) {
        String str = "Hello,  Java!";
        
        // Access string length
        System.out.println("Length: " + str.length());
        
        // Concatenate strings
        System.out.println("Concatenated: " + str.concat(" Let's code!"));

        // Substring
        System.out.println("Substring: " + str.substring(7));

        // Replace characters
        System.out.println("Replaced: " + str.replace('a', 'o'));

        // Change case
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
    }
}
