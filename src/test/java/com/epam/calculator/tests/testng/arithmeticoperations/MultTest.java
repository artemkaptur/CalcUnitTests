package com.epam.calculator.tests.testng.arithmeticoperations;

import com.epam.calculator.tests.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultTest extends BaseCalculatorTest {

    private long valueOne;

    private long valueTwo;

    private double valueThree;

    private double valueFour;

    private long expectedLong;

    private double expectedDouble;

    @Factory(dataProvider = "multDataProvider")
    public MultTest(long valueOne, long valueTwo, long expectedLong, double valueThree, double valueFour, double expectedDouble) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.expectedLong = expectedLong;
        this.valueThree = valueThree;
        this.valueFour = valueFour;
        this.expectedDouble = expectedDouble;
    }

    @Test(priority = 0, groups = "mult")
    public void testMultLong() {
        long result = calculator.mult(valueOne, valueTwo);
        Assert.assertEquals(result, expectedLong, "Invalid result of operation");
    }

    @Test(priority = 1, groups = "mult")
    public void testMultDouble() {
        double result = calculator.mult(valueThree, valueFour);
        Assert.assertEquals(round(result), expectedDouble, "Invalid result of operation");
    }

    @DataProvider(name = "multDataProvider")
    public static Object[][] multDataProv() {
        return new Object[][]{
                {1, 2, 2, 1.5d, 2.5d, 3.75d},
                {-1, -2, 2, -1.5d, -2.5d, 3.75d},
                {-1, 2, -2, -1.5d, 2.5d, -3.75d},
        };
    }

}
