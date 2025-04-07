package java_collection_frame_work;
import java.util.List;
import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");  // Duplicate elements are allowed

        System.out.println(list);  // Output: [Apple, Banana, Apple]
    }
}
