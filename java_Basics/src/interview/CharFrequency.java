package interview;

import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "banana";
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println(freq);
    }
}


//We use a HashMap to store and update character counts using getOrDefault()