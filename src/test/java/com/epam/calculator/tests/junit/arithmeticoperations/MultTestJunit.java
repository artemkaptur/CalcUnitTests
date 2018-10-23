package com.epam.calculator.tests.junit.arithmeticoperations;

import com.epam.calculator.tests.junit.BaseCalculatorTestJunit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class MultTestJunit extends BaseCalculatorTestJunit {

    private long valueOne;

    private long valueTwo;

    private double valueThree;

    private double valueFour;

    private long expectedLong;

    private double expectedDouble;

    private  long deltaLong;

    private double deltaDouble;

    @Parameterized.Parameters
    public static Collection multParam() {
        return Arrays.asList(new Object[][]{
                {1, 2, 2, 0, 1.5d, 2.5d, 3.75d, 0.0d},
                {-1, -2, 2, 0, -1.5d, -2.5d, 3.75d, 0.0d},
                {-1, 2, -2, 0, -1.5d, 2.5d, -3.75d, 0.0d},
                {0, 0, 0, 0, 0.0, 0.0, 0.0, 0.0}
        });
    }

    public MultTestJunit(long a, long b, long expected, long delta, double c, double d, double expD, double deltaD) {
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
    public void testMultLong() {
        long result = calculator.mult(valueOne, valueTwo);
        Assert.assertEquals(expectedLong, result, deltaLong);
    }

    @Test
    public void testMultDouble() {
        double result = calculator.mult(valueThree, valueFour);
        Assert.assertEquals(expectedDouble, round(result), deltaDouble);
    }

}
