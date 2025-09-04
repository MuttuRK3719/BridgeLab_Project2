package filehandlingexample.aggregatingdata;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LogReadWrite {
    public static void main(String[] args) {
        String sourceFile = "src/filehandlingexample/aggregatingdata/logs.txt";
        String desFile = "src/filehandlingexample/aggregatingdata/log_summary.txt";
        readWrite(sourceFile, desFile);
    }

    static void readWrite(String sourceFile, String desFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(desFile))) {
            HashMap<String, Integer> freq = new HashMap<>();
            while (reader.ready()) {
                String line = reader.readLine();
                String[] fields = line.split(",");
                freq.compute(fields[1], (k, v) -> v == null ? 1 : v + 1);
            }
            for (Map.Entry<String, Integer> entry : freq.entrySet()) {
                writer.write(entry.getKey() + " " + entry.getValue() + '\n');
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
