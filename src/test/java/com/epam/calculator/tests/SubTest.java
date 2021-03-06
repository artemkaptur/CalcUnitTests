package com.epam.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubTest extends BaseCalculatorTest {

    private long valueOne;

    private long valueTwo;

    private double valueThree;

    private double valueFour;

    private long expected;

    private double expectedDouble;

    @Factory(dataProvider = "sumDataProvider")
    public SubTest(long valueOne, long valueTwo, long expected, double valueThree, double valueFour, double expectedDouble) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.expected = expected;
        this.valueThree = valueThree;
        this.valueFour = valueFour;
        this.expectedDouble = expectedDouble;
    }

    @Test
    public void testSubLong() {
        long result = calculator.sub(valueOne, valueTwo);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testSubDouble() {
        double result = calculator.sub(valueThree, valueFour);
        Assert.assertEquals(round(result), expectedDouble);
    }

    @DataProvider(name = "sumDataProvider")
    public static Object[][] sumDataProvider() {
        return new Object[][]{
                {1, 1, 0, 1.5, 1.1, 0.4},
                {-1, -1, 0, -1.5, -1.1, -0.4},
                {-1, 1, -2, -1.5, 1.1, -2.6},
        };
    }

    private double round(double value) {
        return (double)Math.round(value * 10000d) / 10000d;
    }

}
