package exceptions;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        int value=100;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = scan.nextInt();
        try {
            value = value / input;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The program executed successfully");
        }
    }
}
