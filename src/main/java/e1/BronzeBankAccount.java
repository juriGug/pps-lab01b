package e1;

public class BronzeBankAccount extends DecoratorBankAccount {

    public BronzeBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public int getFee(int amount) {
        return amount < 100 ? amount : amount + 1;
    }
}
