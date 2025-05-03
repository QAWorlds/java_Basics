package interview;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        System.out.println("Reversed words: " + reversed.trim());
    }
}


//Split the sentence into words, loop in reverse, and join them back.