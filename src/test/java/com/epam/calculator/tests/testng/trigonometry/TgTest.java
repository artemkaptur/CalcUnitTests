package com.epam.calculator.tests.testng.trigonometry;

import com.epam.calculator.tests.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TgTest extends BaseCalculatorTest {

    private double valueOne;

    private double expected;

    @Factory(dataProvider = "tgDataProvider")
    public TgTest(double valueOne, double expected) {
        this.valueOne = valueOne;
        this.expected = expected;
    }

    @Test(groups = "tg", enabled = false)
    public void testTg() {
        double result = calculator.tg(valueOne);
        Assert.assertEquals(round(result), expected, "Invalid result of operation");
    }

    @DataProvider(name = "tgDataProvider")
    public static Object[][] tgDataProv() {
        return new Object[][]{
                {0, 0d},
                {Math.PI / 6, 0.5773d},
                {Math.PI / 4, 1d},
                {Math.PI / 3, 1.732d},
                {Math.PI / 3*2, -0.5773d},
                {Math.PI / 4*3, -1d},
                {Math.PI / 6*5, -1.732d},
                {Math.PI, 0d}
        };
    }

}
