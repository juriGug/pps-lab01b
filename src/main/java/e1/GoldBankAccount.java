package e1;

public class GoldBankAccount extends DecoratorBankAccount {

    public GoldBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public boolean canWithdraw(int amount) {
        int overdraft = 500;
        return this.getBalance() + overdraft < amount;
    }
}
