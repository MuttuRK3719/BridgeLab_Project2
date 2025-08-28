package exceptions.policyapplication.onlinepayment;

public interface AccountOperation {
    boolean deposit(Account account, double amount);

    boolean withdraw(Account account, double amount,int upiPin) throws PaymentFailedException;

    double getMoney(Account account,int upiPin);
}
