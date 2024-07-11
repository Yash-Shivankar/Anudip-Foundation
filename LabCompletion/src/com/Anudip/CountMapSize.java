package com.Anudip;
import java.util.HashMap;
import java.util.Map;

public class CountMapSize {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Cherry", 7);
        map.put("Date", 9);
        map.put("Elderberry", 11);

        int size = map.size();

        System.out.println("The number of key-value mappings in the map: " + size);
    }
}

/*
The number of key-value mappings in the map: 5
*/