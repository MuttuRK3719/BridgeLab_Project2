package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWritter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("src/filehandling/fileWriter.txt");
        fileWriter.write("muttu");
        fileWriter.write("kagal");
        fileWriter.close();
        FileWriter fileWriter1=new FileWriter("src/filehandling/fileWriter.txt",true);
        fileWriter1.write("\n the text is appended");
        fileWriter1.close();


    }
}
