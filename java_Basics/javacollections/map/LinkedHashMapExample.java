package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> config = new LinkedHashMap<>();
        config.put("browser", "chrome");
        config.put("headless", "false");
        config.put("timeout", "30");

        for (Map.Entry<String, String> entry : config.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
