package List;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Mango");  // Duplicate allowed

        System.out.println(fruits.get(0)); // Apple

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
