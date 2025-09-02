package filehandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("WritingFile.txt");
        int data = 0;
        while ((data = fileInputStream.read()) != -1) {
            System.out.println((char) (data));
        }
//        FileReader fileReader=new FileReader()
    }
}
