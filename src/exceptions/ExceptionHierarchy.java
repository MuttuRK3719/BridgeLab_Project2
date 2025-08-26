package exceptions;

import exceptions.customexception.unchecked.NegativeNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHierarchy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String name=null;
        System.out.println("Enter two number");
        int firstNum = scan.nextInt();
        int secNum = scan.nextInt();
        name.charAt(9);

        int result=firstNum/secNum;
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("We cannot divide anything zero");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter correct value ");
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
        }
    }
}
