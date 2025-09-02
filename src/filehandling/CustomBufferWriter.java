package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CustomBufferWriter {
    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/filehandling/BufferFile.txt"));
        bufferedWriter.write("Hii this is first line");
        BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("src/filehandling/BufferFile.txt", true));
        bufferedWriter.close();
        bufferedWriter1.append("\nSecond line");
        bufferedWriter1.close();
    }
}
