package filehandlingexample.countwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) {
        String filePath = "src/filehandlingexample/countwords/TextFile.txt";
        System.out.println(countWordsInFile(filePath));//10
    }

    static int countWordsInFile(String filePath) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.ready()) {
                String sentence = reader.readLine();
                count += sentence.chars().filter((c -> c == 32)).count();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return count + 1;
    }
}
