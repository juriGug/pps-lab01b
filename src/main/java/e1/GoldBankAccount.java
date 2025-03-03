package e1;

public class GoldBankAccount extends DecoratorBankAccount {

    public GoldBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public void withdraw(int amount) {
        int overdraft = 500;
        if(base.getBalance() - amount + overdraft < 0)
            throw new IllegalStateException();
        super.withdraw(amount);
    }
}
