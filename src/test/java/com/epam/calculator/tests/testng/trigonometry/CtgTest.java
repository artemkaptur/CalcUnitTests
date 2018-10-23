package com.epam.calculator.tests.testng.trigonometry;

import com.epam.calculator.tests.testng.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CtgTest extends BaseCalculatorTest {

    private double valueOne;

    private double expected;

    @Factory(dataProvider = "ctgDataProvider")
    public CtgTest(double valueOne, double expected) {
        this.valueOne = valueOne;
        this.expected = expected;
    }

    @Test(groups = "ctg", enabled = false)
    public void testCtg() {
        double result = calculator.ctg(valueOne);
        Assert.assertEquals(round(result), expected,"Invalid result of operation");
    }

    @DataProvider(name = "ctgDataProvider")
    public static Object[][] ctgDataProv() {
        return new Object[][]{
                {Math.PI / 6, 1.732d},
                {Math.PI / 4, 1d},
                {Math.PI / 3, 0.5773d},
                {Math.PI / 2, 0d},
                {Math.PI / 3*2, -0.5773d},
                {Math.PI / 4*3, -1d},
                {Math.PI / 6*5, -1.732d},
        };
    }

}
