package io.muehlbachler.bswe3b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private CalculatorService calc = new CalculatorService();

    @Test
    public void testDividePositiveNumberNoRemainder() {
        assertEquals(1, calc.divide(1, 1), "1/1 should be 1");
    }

    // FIXME: implement more tests

    @Test
    public void testDividePositiveNumberWithRemainder() {
        assertEquals(2, calc.divide(5, 2), "5/2 should be 2, considering integer division");
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0), "Dividing by zero should throw ArithmeticException");
    }

    @Test
    public void testDivideByNegativeNumber() {
        assertEquals(-5, calc.divide(10, -2), "10/-2 should be 0");
    }

    @Test
    public void testDivideNegativeByPositive() {
        assertEquals(-5, calc.divide(-10, 2), "-10/2 should be -5");
    }
}
