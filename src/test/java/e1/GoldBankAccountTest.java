package e1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GoldBankAccountTest extends BankAccountTest{
    public void GoldBankAccount() {
        account = new GoldBankAccount(new CoreBankAccount());
    }

    @Override
    public void testCanWithdraw() {
        this.account.deposit(1000);
        this.account.withdraw(200);
        assertEquals(800, this.account.getBalance());

    }

    @Override
    public void testCannotWithdrawMoreThanAvailable() {
        this.account.deposit(1000);
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(1600));
    }
}
