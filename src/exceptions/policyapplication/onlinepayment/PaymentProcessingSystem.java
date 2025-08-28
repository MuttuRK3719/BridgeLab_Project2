package exceptions.policyapplication.onlinepayment;

public class PaymentProcessingSystem {
    public static void main(String[] args) throws PaymentFailedException {
        Account account1=new Account("muttu@ybl",1234,10000);
        Account account2=new Account("Pras@bheem",4567);
        AccountOperation operation=new UPIOperation();
        operation.deposit(account2,2000);
        System.out.println(operation.getMoney(account2,4567));
        operation.withdraw(account1,2000,1234);
    }
}
