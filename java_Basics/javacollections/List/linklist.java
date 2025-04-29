package List;

import java.util.LinkedList;
import java.util.List;

public class linklist {
    public static void main(String[] args) {
        List<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Hyderabad");
        cities.addFirst("Bangalore");  // LinkedList special method

        System.out.println(cities.get(1)); // Delhi

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
//  Extra: LinkedList allows extra methods like addFirst(), addLast(), removeFirst(), removeLast(), 
//because it is like a queue or stack too.