package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        File  file=new File("WritingFile.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write('M');
        fileOutputStream.write('U');
        fileOutputStream.write('T');
        fileOutputStream.write('T');
        fileOutputStream.write('U');

    }
}
