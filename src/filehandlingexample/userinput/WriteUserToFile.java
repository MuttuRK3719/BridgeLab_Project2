package filehandlingexample.userinput;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteUserToFile {
    public static void main(String[] args) {
        String filePath = "src/filehandlingexample/userinput/userInput.txt";
        userInputToFile(filePath);
    }

    static void userInputToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            int count = 0;
            Scanner scanner = new Scanner(System.in);
            while (count < 5) {
                writer.write(scanner.next()+" ");
                count++;
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
