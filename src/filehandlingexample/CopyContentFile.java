package filehandlingexample;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyContentFile {
    public static void main(String[] args) {
        String sourceFilePath = "src/filehandlingexample/SourceFile.txt";
        String destinationFilePath = "src/filehandlingexample/destinationFile.txt";
        readFile(sourceFilePath);
        writeToFile(sourceFilePath, destinationFilePath);
    }

    public static void readFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            int data = 0;
            while (reader.ready()) {
                System.out.print((char) reader.read());
            }
        } catch (Exception exception) {
            System.out.println(exception.getCause());
        }
    }

    public static void writeToFile(String sourceFilePath, String desFilePath) {
        try (FileWriter writer = new FileWriter(desFilePath)) {
            FileReader reader = new FileReader(sourceFilePath);

            while (reader.ready()) {
                writer.write((char) (reader.read()));
            }
        } catch (Exception exception) {
            System.out.println(exception.getCause());
        }
    }
}
