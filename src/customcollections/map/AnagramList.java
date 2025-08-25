package customcollections.map;

import java.util.*;

public class AnagramList {
    public static void main(String[] args) {
        List<String> list = List.of("eat", "tea", "tan", "ate", "nat", "bat");
        System.out.println(listAnagrams3(list));
    }

    public static List<List<String>> listAnagrams(List<String> list) {
        Map<String, List<String>> freq = new HashMap<>();
        for (String s : list) {
            char[] chs = s.toCharArray();
            Arrays.sort(chs);
            String sortedstr = new String(chs);
            freq.computeIfAbsent(sortedstr, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(freq.values());
    }

    public static List<List<String>> listAnagrams2(List<String> list) {
        Map<String, List<String>> freq = new HashMap<>();
        for (String s : list) {
            char[] chs = s.toCharArray();
            Arrays.sort(chs);
            String sortedstr = new String(chs);
            freq.compute(sortedstr, (k, v) -> {
                if (v == null) {
                    return new ArrayList<>(List.of(s));
                } else {
                    v.add(s);
                    return v;
                }
            });
        }
        return new ArrayList<>(freq.values());
    }

    public static List<List<String>> listAnagrams3(List<String> list) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : list) {
            String sorted = word.chars()
                    .sorted()
                    .collect(StringBuilder::new,
                            StringBuilder::appendCodePoint,
                            StringBuilder::append)
                    .toString();

            groups.merge(sorted, new ArrayList<>(List.of(word)),
                    (oldList, newList) -> {
                        oldList.addAll(newList);
                        return oldList;
                    });
        }
        return new ArrayList<>(groups.values());
    }
}
