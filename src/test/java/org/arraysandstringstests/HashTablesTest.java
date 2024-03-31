package org.arraysandstringstests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

import org.arraysandstrings.HashTables;

public class HashTablesTest {

    // Test the getHashMap method to ensure it returns a non-null object
    @Test
    public void testGetHashMapReturnsNonNull() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        HashTables hashTables = new HashTables();
        Assertions.assertNotNull(hashTables.getHashMap(map));
    }

    // Test the getHashMap method to ensure it returns a map with the correct size
    @Test
    public void testGetHashMapReturnsCorrectSize() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        HashTables hashTables = new HashTables();
        Assertions.assertEquals(2, hashTables.getHashMap(map).size());
    }

    // Test the getHashMap method to ensure it returns a map containing all the correct keys
    @Test
    public void testGetHashMapContainsKeys() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        HashTables hashTables = new HashTables();
        HashMap<Integer, String> resultMap = hashTables.getHashMap(map);
        Assertions.assertTrue(resultMap.keySet().containsAll(map.keySet()));
    }

    // Test the getHashMap method to ensure it returns a map containing all the correct values
    @Test
    public void testGetHashMapContainsValues() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        HashTables hashTables = new HashTables();
        HashMap<Integer, String> resultMap = hashTables.getHashMap(map);
        Assertions.assertTrue(resultMap.values().containsAll(map.values()));
    }

    // Test the getHashMap method to ensure it returns a map that's equal to the one passed in
    @Test
    public void testGetHashMapReturnsEqualMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        HashTables hashTables = new HashTables();
        HashMap<Integer, String> resultMap = hashTables.getHashMap(map);
        Assertions.assertEquals(map, resultMap);
    }
}
