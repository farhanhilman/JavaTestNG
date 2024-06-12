package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    double a = 10, b = 5;

    @Test
    public void testAdd() {
        double expected = 15;
        double actual = calculator.add(a, b);
        //Validate
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSubtract() {
        double expectedSubtract = 5;
        double actualSubtract = calculator.subtract(a, b);

        Assert.assertEquals(actualSubtract, expectedSubtract);

    }

    //Assert
    @Test
    public void testNumberGreaterThan() {
        int number = 21;
        boolean actual = number > 15;
        Assert.assertTrue(actual);
    }

    @Test
    public void compareString() {
        String actual = "Berhasil Login";
        String expected = "hasil";
        Assert.assertTrue(actual.contains(expected));
    }

}
