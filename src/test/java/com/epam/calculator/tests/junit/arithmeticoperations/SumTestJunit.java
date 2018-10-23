package com.epam.calculator.tests.junit.arithmeticoperations;

import com.epam.calculator.tests.junit.BaseCalculatorTestJunit;
import com.epam.calculator.tests.testng.BaseCalculatorTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class SumTestJunit extends BaseCalculatorTestJunit {

    private long valueOne;

    private long valueTwo;

    private double valueThree;

    private double valueFour;

    private long expectedLong;

    private double expectedDouble;

    private long deltaLong;

    private double deltaDouble;

    @Parameterized.Parameters
    public static Collection sumParam() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2, 0, 1.5, 1.1, 2.6, 0.0},
                {-1, -1, -2, 0, -1.5, -1.1, -2.6, 0.0},
                {-1, 1, 0, 0, -1.5, 1.1, -0.4, 0.0},
                {0, 0, 0, 0, 0.0, 0.0, 0.0, 0.0}
        });
    }

    public SumTestJunit(long a, long b, long expected, long delta, double c, double d, double expD, double deltaD) {
        this.valueOne = a;
        this.valueTwo = b;
        this.valueThree = c;
        this.valueFour = d;
        this.expectedLong = expected;
        this.deltaLong = delta;
        this.expectedDouble = expD;
        this.deltaDouble = deltaD;
    }

    @Test
    public void testSumLong() {
        long result = calculator.sum(valueOne, valueTwo);
        Assert.assertEquals(expectedLong, result, deltaLong);
    }

    @Test
    public void testSumDouble() {
        double result = calculator.sum(valueThree, valueFour);
        Assert.assertEquals(expectedDouble, round(result), deltaDouble);
    }

}
