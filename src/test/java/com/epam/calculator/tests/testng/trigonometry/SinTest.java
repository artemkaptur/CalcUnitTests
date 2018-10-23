package com.epam.calculator.tests.testng.trigonometry;

import com.epam.calculator.tests.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SinTest extends BaseCalculatorTest {

    private double valueOne;

    private double expected;

    @Factory(dataProvider = "sinDataProvider")
    public SinTest(double valueOne, double expected) {
        this.valueOne = valueOne;
        this.expected = expected;
    }

    @Test(groups = "sin")
    public void testPow() {
        double result = calculator.sin(valueOne);
        Assert.assertEquals(round(result), expected, "Invalid result of operation");
    }

    @DataProvider(name = "sinDataProvider")
    public static Object[][] sinDataProv() {
        return new Object[][]{
                {0, 0d},
                {Math.PI / 6, 0.5d},
                {Math.PI / 4, 0.7071d},
                {Math.PI / 3, 0.866d},
                {Math.PI / 2, 1d},
                {Math.PI / 3*2, 0.866d},
                {Math.PI / 4*3, 0.7071d},
                {Math.PI / 6*5, 0.5d},
                {Math.PI, 0d}
        };
    }

}
