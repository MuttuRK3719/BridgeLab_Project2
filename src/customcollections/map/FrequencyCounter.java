package customcollections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        countFrequency2("mutturaj");
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

    static void countFrequency1(String word) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            //if it is present
            freq.computeIfPresent(ch, (k, v) -> v + 1);
            //if it is not present
            freq.putIfAbsent(ch, 1);
        }
        for (var map : freq.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
    static void countFrequency2(String word) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            freq.compute(ch,(k,v)->v==null?1:v+1);
        }
        for (var map : freq.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
