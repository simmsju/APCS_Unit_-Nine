import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapeziodTest {

    @Test
    void area() {
        Trapeziod t = new Trapeziod(4, 8, 3);
        double expected = 18.0;
        double actual = t.area();
        assertEquals(expected, actual);
    }
}