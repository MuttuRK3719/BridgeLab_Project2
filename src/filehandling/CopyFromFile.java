package filehandling;

import java.io.*;

public class CopyFromFile {
    public static void main(String[] args) throws IOException {
        File  file=new File("src/addressbook/Contact.java");
        FileInputStream fileInputStream=new FileInputStream(file);
        FileOutputStream fileOutputStream=new FileOutputStream("src/filehandling/TestFile.txt");
        int data=0;
        while((data=fileInputStream.read())!=-1){
            fileOutputStream.write((char)data);
        }
    }
}
