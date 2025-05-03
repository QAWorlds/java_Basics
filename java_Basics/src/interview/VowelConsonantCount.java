package interview;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "hello world";
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}


///We check each character. If it's a letter, we count vowels and consonants separately.