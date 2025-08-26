package exceptions.customexception.unchecked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionChaining {
    public static void main(String[] args) {
        try {
            fileHandling();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Original Cause: " + e.getCause());
        }
    }

    public static void fileHandling() throws Exception {
        try {
            File file = new File("C:\\Users\\OneDrive\\Desktop\\spingboot\\BridgeLab1\\src\\Pages.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (IOException e) {
            throw new Exception("File not found ", e);
        }
    }
}
