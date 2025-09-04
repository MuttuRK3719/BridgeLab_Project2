package filehandlingexample.largedataprocessing;

import java.io.*;

public class BufferReaderWriter {
    public static void main(String[] args) {
        String sourceFile = "src/filehandlingexample/largedataprocessing/transactions.txt";
        String desFile = "src/filehandlingexample/largedataprocessing/filtered_transactions.txt";
        bufferReader(sourceFile, desFile, 2000);
    }

    static void bufferReader(String sourceFile, String designationFile, double thresholdAmount) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(designationFile));
        ) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] arr = line.split(",");
                double amount = Double.parseDouble(arr[2]);
                if (amount > thresholdAmount) {
                    writer.write(line+'\n');
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
