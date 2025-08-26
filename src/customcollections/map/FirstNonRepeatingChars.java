package customcollections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChars {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("mukttum"));
    }
    static char firstNonRepeatingChar(String s) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.computeIfPresent(ch, (k, v) -> v + 1);
            freq.putIfAbsent(ch, 1);
        }
        for (var map : freq.entrySet()) {
            if (map.getValue() == 1) return map.getKey();
        }
        return 0;
    }
}
