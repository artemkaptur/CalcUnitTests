package com.epam.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultTest extends BaseCalculatorTest{

    private long valueOne;

    private long valueTwo;

    private double valueThree;

    private double valueFour;

    private long expected;

    private double expectedDouble;

    @Factory(dataProvider = "sumDataProvider")
    public MultTest(long valueOne, long valueTwo, long expected, double valueThree, double valueFour, double expectedDouble) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.expected = expected;
        this.valueThree = valueThree;
        this.valueFour = valueFour;
        this.expectedDouble = expectedDouble;
    }

    @Test
    public void testMultLong() {
        long result = calculator.mult(valueOne, valueTwo);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testMultDouble() {
        double result = calculator.mult(valueThree, valueFour);
        Assert.assertEquals(round(result), expectedDouble);
    }

    @DataProvider(name = "sumDataProvider")
    public static Object[][] sumDataProvider() {
        return new Object[][]{
                {1, 2, 2, 1.5d, 2.5d, 3.75d},
                {-1, -2, 2, -1.5d, -2.5d, 3.75d},
                {-1, 2, -2, -1.5d, 2.5d, -3.75d},
        };
    }

    private double round(double value) {
        return (double)Math.round(value * 10000d) / 10000d;
    }
}
