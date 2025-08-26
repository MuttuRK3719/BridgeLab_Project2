package exceptions.customexception.unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account account=new Account("muttu",5000);
        System.out.println("Enter amount you want debate ");
        double amount = scan.nextDouble();
        try {
            if (account.getBalance() < amount) throw new InsufficientFundsException();
            account.setBalance(account.getBalance()-amount);
            System.out.println("the amount is debated successfully");
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

    }
}
