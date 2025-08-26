package exceptions.customexception.unchecked;

import java.util.Scanner;

public class NegativeNumberExce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        try {
            if (age < 0) throw new NegativeNumberException();
            System.out.println("you can collect ur voter id");
        } catch (NegativeNumberException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
