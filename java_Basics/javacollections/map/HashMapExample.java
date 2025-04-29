package map;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> user = new HashMap<>();
        user.put("Name", "John");
        user.put("Role", "QA");
        user.put("Project", "Automation");
        user.put("Role", "Lead"); // Replaces old value

        System.out.println("User Role: " + user.get("Role")); // Lead

        for (Map.Entry<String, String> entry : user.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
