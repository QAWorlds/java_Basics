package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Selenium");
        set.add("TestNG");
        set.add("JUnit");
        set.add("Selenium"); // Duplicate ignored

        for (String tool : set) {
            System.out.println(tool);
        }
    }
}

