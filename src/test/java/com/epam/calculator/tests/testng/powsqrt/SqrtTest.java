package com.epam.calculator.tests.testng.powsqrt;

import com.epam.calculator.tests.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SqrtTest extends BaseCalculatorTest {

    private double valueOne;

    private double expected;

    @Factory(dataProvider = "sqrtDataProvider")
    public SqrtTest(double valueOne, double expected) {
        this.valueOne = valueOne;
        this.expected = expected;
    }

    @Test(groups = "sqrt")
    public void testSqrt() {
        double result = calculator.sqrt(valueOne);
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    @DataProvider(name = "sqrtDataProvider")
    public static Object[][] sqrtDataProv() {
        return new Object[][]{
                {4, 2},
                {0, 0}
        };
    }
}
