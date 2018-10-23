package com.epam.calculator.tests.testng.powsqrt;

import com.epam.calculator.tests.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PowTest extends BaseCalculatorTest {

    private double valueOne;

    private double valueTwo;

    private double expected;

    @Factory(dataProvider = "powDataProvider")
    public PowTest(double valueOne, double valueTwo, double expected) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.expected = expected;
    }

    @Test(groups = "pow")
    public void testPow() {
        double result = calculator.pow(valueOne, valueTwo);
        Assert.assertEquals(round(result), expected, "Invalid result of operation");
    }

    @Test(expectedExceptions = Exception.class)
    public void testPowZeroInNegative() {
        double result = calculator.pow(0, -2);
    }

    @DataProvider(name = "powDataProvider")
    public static Object[][] powDataProv() {
        return new Object[][]{
                {2, 2, 4d},
                {-2, 2, 4d},
                {2, -2, 0.25d},
                {-2, -2, 0.25d},
                {-2, 3, -8d},
                {2, 0, 1d},
                {0, 2, 0d},
        };
    }
}
