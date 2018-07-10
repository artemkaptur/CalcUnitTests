package com.epam.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivTest extends BaseCalculatorTest{

    private long valueOne;

    private long valueTwo;

    private double valueThree;

    private double valueFour;

    private long expected;

    private double expectedDouble;

    @Factory(dataProvider = "sumDataProvider")
    public DivTest(long valueOne, long valueTwo, long expected, double valueThree, double valueFour, double expectedDouble) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.expected = expected;
        this.valueThree = valueThree;
        this.valueFour = valueFour;
        this.expectedDouble = expectedDouble;
    }

    @Test
    public void testMultLong() {
        long result = calculator.div(valueOne, valueTwo);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testMultDouble() {
        double result = calculator.div(valueThree, valueFour);
        Assert.assertEquals(round(result), expectedDouble);
    }

    @DataProvider(name = "sumDataProvider")
    public static Object[][] sumDataProvider() {
        return new Object[][]{
                {4, 2, 2, 3.75d, 2.5d, 1.5d},
                {-4, -2, 2, -3.75d, -2.5d, 1.5d},
                {-4, 2, -2, -3.75d, 2.5d, -1.5d},
        };
    }

    private double round(double value) {
        return (double)Math.round(value * 10000d) / 10000d;
    }
}
