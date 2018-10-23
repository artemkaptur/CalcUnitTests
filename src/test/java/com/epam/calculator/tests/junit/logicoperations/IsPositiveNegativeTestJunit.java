package com.epam.calculator.tests.junit.logicoperations;

import com.epam.calculator.tests.junit.BaseCalculatorTestJunit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(value = Parameterized.class)
public class IsPositiveNegativeTestJunit extends BaseCalculatorTestJunit {

    private long value;

    private boolean expectedToBePositive;

    private boolean expectedToBeNegative;

    @Parameterized.Parameters
    public static Collection powParam() {
        return Arrays.asList(new Object[][]{
                {1, true, false},
                {-1, false, true},
                {0, false, false}
        });
    }

    public IsPositiveNegativeTestJunit(long value, boolean expectedToBePositive, boolean expectedToBeNegative) {
        this.value = value;
        this.expectedToBePositive = expectedToBePositive;
        this.expectedToBeNegative = expectedToBeNegative;
    }

    @Test()
    public void checkValuePositive() {
        assertTrue(calculator.isPositive(value) == expectedToBePositive);
    }

    @Test()
    public void checkValueNegative() {
        assertTrue(calculator.isNegative(value) == expectedToBeNegative);
    }

}
