package e1;

public class DecoratorBankAccount implements BankAccount{
    protected BankAccount base;

    public DecoratorBankAccount(BankAccount bankAccount) {
        this.base = bankAccount;
    }

    public int getBalance() {
        return base.getBalance();
    }

    public void deposit(int amount) { base.deposit(amount); };

    public void withdraw(int amount) {
        base.withdraw(amount);
    };
}
