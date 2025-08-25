package customcollections.map;

import java.util.*;

public class AnagramList {
    public static void main(String[] args) {
    List<String>list=List.of("eat", "tea", "tan", "ate", "nat", "bat");
        System.out.println(listAnagrams(list));
    }
    public static List<List<String>> listAnagrams(List<String>list){
        Map<String,List<String>>freq=new HashMap<>();
        for(String s:list){
            char []chs=s.toCharArray();
            Arrays.sort(chs);
            String sortedstr=new String(chs);
            freq.computeIfAbsent(sortedstr,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(freq.values());
    }
}
