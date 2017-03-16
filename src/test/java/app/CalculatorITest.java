package app;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorITest {
    @Test
    public void givenValidNumbers_whenCallingAdd_shouldReturnValidNumber() {
        Calculator c = new Calculator();

        Double test = c.add(123456D, 789123D);
        Double expected = 912579D;

        Assert.assertEquals(expected, test);
    }

    @Test
    public void givenValidNumbers_whenCallingSub_shouldReturnValidNumber() {
        Calculator c = new Calculator();

        Double test = c.sub(123456D, 789123D);
        Double expected = -665667D;

        Assert.assertEquals(expected, test);
    }

    @Test
    public void givenValidNumbers_whenCallingMul_shouldReturnValidNumber() {
        Calculator c = new Calculator();

        Double test = c.mul(1234D, 7891D);
        Double expected = 9737494D;

        Assert.assertEquals(expected, test);
    }

    @Test
    public void givenValidNumbers_whenCallingDiv_shouldReturnValidNumber() {
        Calculator c = new Calculator();

        Double test = c.div(4D, 2D);
        Double expected = 2D;

        Assert.assertEquals(expected, test);
    }
}
