package arrays.logical_problems;

import java.util.*;

public class DemoMap {
   public static void main(String[] args) {
       // 1. Create a HashMap
       // Key : String
       // Value : Integer
       HashMap<String, Integer> studentAges = new HashMap<>();

       // 2. Add elements using put()
       studentAges.put("Ayush", 20);
       studentAges.put("Rahul", 20);
       studentAges.put("Mayank", 20);

       // 3. Access an element using get()
       System.out.println("Ayush's age: " + studentAges.get("Ayush"));
       // Output: Ayush's age: 20

       // 4. Overwrite a value
       studentAges.put("Ayush", 21);
       // Ayush's age is now 21

       // 5. Check if a key or value exists
       boolean hasMayank = studentAges.containsKey("Mayank");
       // true

       // 6. Remove an element
       studentAges.remove("Rahul");

       // 7. Iterate over the HashMap
       for(String name : studentAges.keySet()){
           System.out.println(name);
       }
    }
}
