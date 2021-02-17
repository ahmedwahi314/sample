import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sqrt_test() {
        Calculator c = new Calculator("my_calc");
        double x = c.sqrt_f(4);
        assertEquals(2.0,x,0.0);
        x = c.sqrt_f(5);
        assertEquals(2.23606797749979,x,0.005);
    }
    @Test
    public void factorial_test() {
        Calculator c = new Calculator("my_calc");
        int x = c.factorial(4);
        assertEquals(24,x);
        x = c.factorial(0);
        assertEquals(1,x);
        x = c.factorial(-2);
        assertEquals(0,x);
    }
}