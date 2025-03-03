package e1;

public class BronzeBankAccount extends DecoratorBankAccount {

    public BronzeBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public void withdraw(int amount) {
        if(base.getBalance() - amount < 0)
            throw new IllegalStateException();
        super.withdraw(amount < 100 ? amount : amount + 1);
    }

}
