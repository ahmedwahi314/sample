import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator c = new Calculator("my_calc");
        int x = c.add(1,2);
        assertEquals(3,x);
    }

    @Test
    public void sqrt_test() {
        Calculator c = new Calculator("my_calc");
        double x = c.sqrt_f(4);
        assertEquals(2.0,x,0.0);
        x = c.sqrt_f(5);
        assertEquals(2.23606797749979,x,0.005);
    }
}