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
        if (canWithdraw(amount)){
            throw new IllegalStateException();
        }
        base.withdraw(amount + getFee(amount));
    };

    public int getFee(int amount) {
        return 0;
    }

    public boolean canWithdraw(int amount) {
        return (base.getBalance() - amount < 0);
    }
}
