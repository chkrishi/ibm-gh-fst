package Activity11;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Violet");
        hash_map.put(2, "Indigo");
        hash_map.put(3, "Blue");
        hash_map.put(4, "Purple");
        hash_map.put(5, "Black");

        System.out.println("The Original map: " + hash_map);
        
        hash_map.remove(4);
        System.out.println("Map after removing purple: " + hash_map);
        
        if(hash_map.containsValue("Grey")) {
            System.out.println("Grey is in the Map");
        } else {
            System.out.println("No Grey");
        }
        System.out.println("Map size: " + hash_map.size());
    }
}



//Create a Map named colours with integer keys and String values.
//Add 5 random colours to it and print the Map to the console.
//Remove one colour using the remove() method.
//Check if the colour green exists in the Map using the containsValue() method.
//Print the size of the Map using the size() method.