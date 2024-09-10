import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountFacadeTest {
    @Test
    public void testBankAccountOperations() {
        BankAccountFacade account = new BankAccountFacade(123456);
        account.openAccount();
        account.deposit(1000.0);
        assertEquals(1000.0, account.getBalance());
        account.withdraw(500.0);
        assertEquals(500.0, account.getBalance());
        account.withdraw(600.0);
        assertEquals(500.0, account.getBalance());  // Balance should remain 500 due to insufficient funds
    }
}
