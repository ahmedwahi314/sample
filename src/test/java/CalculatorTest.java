import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator c = new Calculator("my_calc");
        int x = c.add(1,2);
        assertEquals(3,x);
    }
}