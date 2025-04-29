package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> tools = new LinkedHashSet<>();
        tools.add("Selenium");
        tools.add("TestNG");
        tools.add("JUnit");
        tools.add("Selenium"); // Ignored

        for (String tool : tools) {
            System.out.println(tool);
        }
    }
}

