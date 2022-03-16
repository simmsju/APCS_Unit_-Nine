import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void accountsTheSame() {
        Account a1 = new Account("test", 1234.56);
        Account a2 = new Account("test", 1234.56);
        Account a3 = a1;
        assertEquals(a1, a2);
        assertEquals(a3, a2);
    }

    @Test
    public void accountsDifferent() {
        Account a1 = new Account("testing", 1234.56);
        Account a2 = new Account("test", 1234.56);
        Account a3 = new Account("test", 1234.55);
        assertNotEquals(a1, a2);
        assertNotEquals(a3, a2);
    }

}