package filehandling;

import java.io.*;

public class BufferReaderClass {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("src/filehandling/TestFile.txt"));
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
        BufferedReader bufferedReader1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bufferedReader1.readLine());
    }
}
