package app;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void givenValidNumbers_whenCallingAdd_shouldReturnValidNumber() {
        Calculator c = new Calculator();

        Double test = c.add(2D, 2D);
        Double expected = 4D;

        Assert.assertEquals(expected, test);
    }

    @Test
    public void givenValidNumbers_whenCallingSub_shouldReturnValidNumber() {
        Calculator c = new Calculator();

        Double test = c.sub(4D, 2D);
        Double expected = 2D;

        Assert.assertEquals(expected, test);
    }

    @Test
    public void givenValidNumbers_whenCallingMul_shouldReturnValidNumber() {
        Calculator c = new Calculator();

        Double test = c.mul(2D, 2D);
        Double expected = 4D;

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
