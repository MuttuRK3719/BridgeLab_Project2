package exceptions.customexception.checked;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        try {
            new Voter().register(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

}
