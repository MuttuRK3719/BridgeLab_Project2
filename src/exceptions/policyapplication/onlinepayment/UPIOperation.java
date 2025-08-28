package exceptions.policyapplication.onlinepayment;

public class UPIOperation implements AccountOperation {

    @Override
    public boolean deposit(Account account, double amount) {
        account.setBalance(amount);
        return true;
    }

    @Override
    public boolean withdraw(Account account, double amount, int upiPin) throws PaymentFailedException {
        if (account.getBalance() >= amount) {
            if (account.getUpiPin() != upiPin) throw new InvalidPaymentDetailsException();
            account.setBalance(account.getBalance() - amount);
            return true;
        } else {
            throw new PaymentFailedException("Insufficint balance");
        }
    }

    @Override
    public double getMoney(Account account, int upiPin) {
        if (account.getUpiPin() != upiPin) throw new InvalidPaymentDetailsException();
        else {
            return account.getBalance();
        }
    }
}
