package e1;

public class SilverBankAccount extends DecoratorBankAccount{

    public SilverBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public int getFee(int amount) {
        return 1;
    }
}
