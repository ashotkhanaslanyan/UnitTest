package org.arraysandstrings;

import java.util.HashMap;

public class HashTables {

    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Example of adding elements to the map
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        map.put(4, "Dave");
        map.put(5, "Eve");

        // This could be a method to return the map for use elsewhere
        HashMap<Integer, String> resultMap = getHashMap(map);

        // Displaying the contents of the map
        for (Integer key : resultMap.keySet()) {
            System.out.println(STR."Key = \{key}, Value = \{resultMap.get(key)}");
        }
    }

    public static HashMap<Integer, String> getHashMap(HashMap<Integer, String> inputMap) {
        return inputMap;
    }
}
