package filehandlingexample.reversecontent;

import java.io.*;

public class ReverseContentFile {
    public static void main(String[] args) {
        String inputFile = "src/filehandlingexample/reversecontent/input.txt";
        String reversedFile = "src/filehandlingexample/reversecontent/reveredFile.txt";
        reverseContent(inputFile, reversedFile);
    }

    static void reverseContent(String inputFilePath, String reverseFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(reverseFilePath))
        ) {
            while (reader.ready()) {
                String sentence = new StringBuilder(reader.readLine()).reverse() + "\n";
                writer.write(sentence);
            }
            System.out.println("File content is reversed sucessfully");
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
