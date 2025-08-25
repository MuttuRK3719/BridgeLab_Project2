package customcollections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        countFrequency("mutturaj");
    }

    static void countFrequency(String word) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            freq.put(word.charAt(i), freq.getOrDefault(word.charAt(i), 0) + 1);
        }
        for (var map : freq.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
