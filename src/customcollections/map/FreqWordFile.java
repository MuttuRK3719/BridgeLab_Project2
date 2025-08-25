package customcollections.map;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FreqWordFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\spingboot\\BridgeLab1\\src\\Pages.txt");
        frequencyWordInFile(file);
    }

    static void frequencyWordInFile(File file) throws IOException {
        FileInputStream fos = new FileInputStream(file);
        int data = 0;
        StringBuilder sb = new StringBuilder();
        while ((data = fos.read()) != -1) {
            sb.append((char)(data));
        }
        frequencyWordInFile(sb.toString());
    }

    static void frequencyWordInFile(String st) {
        String[] words = st.split(" ");
        Map<String, Integer> freq = new HashMap<>();
        for (String s : words) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        for (var map : freq.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
