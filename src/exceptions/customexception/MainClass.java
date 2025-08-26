package exceptions.customexception;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException();
            }
            System.out.println("Your are eligible for voting");
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
