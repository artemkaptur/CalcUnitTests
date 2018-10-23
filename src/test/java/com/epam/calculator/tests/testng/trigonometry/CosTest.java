package com.epam.calculator.tests.testng.trigonometry;

import com.epam.calculator.tests.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CosTest extends BaseCalculatorTest {
    private double valueOne;

    private double expected;

    @Factory(dataProvider = "cosDataProvider")
    public CosTest(double valueOne, double expected) {
        this.valueOne = valueOne;
        this.expected = expected;
    }

    @Test(groups = "cos", enabled = false)
    public void testCos() {
        double result = calculator.cos(valueOne);
        Assert.assertEquals(round(result), expected, "Invalid result of operation");
    }

    @DataProvider(name = "cosDataProvider")
    public static Object[][] cosDataProv() {
        return new Object[][]{
                {0, 1d},
                {Math.PI / 6, 0.866d},
                {Math.PI / 4, 0.7071d},
                {Math.PI / 3, 0.5d},
                {Math.PI / 2, 0d},
                {Math.PI / 3*2, 0.5d},
                {Math.PI / 4*3, 0.7071d},
                {Math.PI / 6*5, 0.866d},
                {Math.PI, -1d}
        };
    }
}
