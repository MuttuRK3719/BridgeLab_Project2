package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingMultipleExceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        try {
            int firstNum = scan.nextInt();
            int secondNum = scan.nextInt();
            int result;
            result = firstNum / secondNum;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("We connot devide anything zero");
        } catch (InputMismatchException e) {
            System.out.println("Enter correct input type ");
        }
    }
}
