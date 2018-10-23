package com.epam.calculator.tests.testng.arithmeticoperations;

import com.epam.calculator.tests.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivTest extends BaseCalculatorTest {

    private long valueOne;

    private long valueTwo;

    private double valueThree;

    private double valueFour;

    private long expectedLong;

    private double expectedDouble;

    @Factory(dataProvider = "divDataProvider")
    public DivTest(long valueOne, long valueTwo, long expectedLong, double valueThree, double valueFour, double expectedDouble) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.expectedLong = expectedLong;
        this.valueThree = valueThree;
        this.valueFour = valueFour;
        this.expectedDouble = expectedDouble;
    }

    @Test(groups = "div")
    public void testDivLong() {
        long result = calculator.div(valueOne, valueTwo);
        Assert.assertEquals(result, expectedLong, "Invalid result of operation");
    }

    @Test(dependsOnMethods = "testDivLong", groups = "div")
    public void testDivDouble() {
        double result = calculator.div(valueThree, valueFour);
        Assert.assertEquals(round(result), expectedDouble, "Invalid result of operation");
    }

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void testDivByZeroThrowsException() {
        long result = calculator.div(1, 0);
    }

    @DataProvider(name = "divDataProvider")
    public static Object[][] divDataProv() {
        return new Object[][]{
                {4, 2, 2, 3.75d, 2.5d, 1.5d},
                {-4, -2, 2, -3.75d, -2.5d, 1.5d},
                {-4, 2, -2, -3.75d, 2.5d, -1.5d},
        };
    }

}
