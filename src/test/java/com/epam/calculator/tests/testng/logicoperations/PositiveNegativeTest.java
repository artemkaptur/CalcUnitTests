package com.epam.calculator.tests.testng.logicoperations;

import com.epam.calculator.tests.testng.BaseCalculatorTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PositiveNegativeTest extends BaseCalculatorTest {
    private long value;

    private boolean expectedToBePositive;

    private boolean expectedToBeNegative;

    @Factory(dataProvider = "valuesDp")
    public PositiveNegativeTest(long value, boolean expectedToBePositive, boolean expectedToBeNegative) {
        this.value = value;
        this.expectedToBePositive = expectedToBePositive;
        this.expectedToBeNegative = expectedToBeNegative;
    }

    @Test(priority = 0, groups = "positive negative")
    public void checkValuePositive() {
        assertTrue(calculator.isPositive(value) == expectedToBePositive);
    }

    @Test(dependsOnMethods = "checkValuePositive", groups = "positive negative")
    public void checkValueNegative() {
        assertTrue(calculator.isNegative(value) == expectedToBeNegative);
    }

    @DataProvider(name = "valuesDp")
    public static Object[][] valuesForCheck() {
        return new Object[][] {
                {1, true, false},
                {-1, false, true}
        };
    }
}
