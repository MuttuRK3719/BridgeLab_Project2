package exceptions.customexception.unchecked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionChaining {
    public static void main(String[] args) {
        try {
            fileHandling();
        } catch (IOException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fileHandling() throws IOException {
        File file = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\spingboot\\BridgeLab1\\src\\Pages.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
    }
}
