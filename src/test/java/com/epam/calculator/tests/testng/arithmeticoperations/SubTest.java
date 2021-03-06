package com.epam.calculator.tests.testng.arithmeticoperations;

import com.epam.calculator.tests.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubTest extends BaseCalculatorTest {

    private long valueOne;

    private long valueTwo;

    private double valueThree;

    private double valueFour;

    private long expectedLong;

    private double expectedDouble;

    @Factory(dataProvider = "sumDataProvider")
    public SubTest(long valueOne, long valueTwo, long expectedLong, double valueThree, double valueFour, double expectedDouble) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.expectedLong = expectedLong;
        this.valueThree = valueThree;
        this.valueFour = valueFour;
        this.expectedDouble = expectedDouble;
    }

    @Test(priority = 0, groups = "sub")
    public void testSubLong() {
        long result = calculator.sub(valueOne, valueTwo);
        Assert.assertEquals(result, expectedLong);
    }

    @Test(priority = 1, groups = "sub")
    public void testSubDouble() {
        double result = calculator.sub(valueThree, valueFour);
        Assert.assertEquals(round(result), expectedDouble, "Invalid result of operation");
    }

    @DataProvider(name = "sumDataProvider")
    public static Object[][] sumDataProv() {
        return new Object[][]{
                {1, 1, 0, 1.5, 1.1, 0.4},
                {-1, -1, 0, -1.5, -1.1, -0.4},
                {-1, 1, -2, -1.5, 1.1, -2.6},
        };
    }

}
