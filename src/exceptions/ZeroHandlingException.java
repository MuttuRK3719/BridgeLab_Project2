package exceptions;

import java.util.Scanner;

public class ZeroHandlingException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        int result;
        try {
            result = firstNum / secondNum;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("We connot devide anything zero");
        }

    }

}
