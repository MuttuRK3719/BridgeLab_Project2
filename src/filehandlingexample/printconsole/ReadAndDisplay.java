package filehandlingexample.printconsole;

import java.io.*;

public class ReadAndDisplay {
    public static void main(String[] args) {
        String filePath = "src/filehandlingexample/printconsole/Input.txt";
        readAndPrint(filePath);
    }

    public static void readAndPrint(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
