package e1;

public class SilverBankAccount extends DecoratorBankAccount{

    public SilverBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public void withdraw(int amount) {
        if(base.getBalance() - amount < 0)
            throw new IllegalStateException();
        super.withdraw(amount + 1);
    }
}
