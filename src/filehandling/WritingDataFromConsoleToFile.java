package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WritingDataFromConsoleToFile {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream fileWriter=new PrintStream("src/filehandling/ConsoleWritenFile.txt");
        PrintStream console=System.out;
        System.setOut(fileWriter);
        System.out.println("Writing in console file");
        System.out.println("Hi,Good morning");
        System.setOut(console);
        System.out.println("Print in console");
    }
}
