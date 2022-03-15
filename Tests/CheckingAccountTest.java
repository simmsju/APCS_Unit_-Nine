import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    @Test
    void deposit() {
        CheckingAccount c = new CheckingAccount(100);
        double expected = 104.50;
        c.deposit(5);
        double actual = c.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    void withdraw() {
    }

    @Test
    void transfer() {
        CheckingAccount a = new CheckingAccount(100);
        CheckingAccount b = new CheckingAccount(200);
        a.transfer(50, b);
    }
}