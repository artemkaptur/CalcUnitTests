package com.epam.calculator.tests.junit.powsqrt;

import com.epam.calculator.tests.junit.BaseCalculatorTestJunit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class PowTestJunit extends BaseCalculatorTestJunit {

    private double valueOne;

    private double valueTwo;

    private double expected;

    private double delta;

    @Parameterized.Parameters
    public static Collection powParam() {
        return Arrays.asList(new Object[][]{
                {2, 2, 4d, 0.0},
                {-2, 2, 4d, 0.0},
                {2, -2, 0.25d, 0.0},
                {-2, -2, 0.25d, 0.0},
                {-2, 3, -8d, 0.0},
                {2, 0, 1d, 0.0},
                {0, 2, 0d, 0.0},
                {4, 1.5d, 8d, 0.0},
                {4, -1.5d, 0.125d, 0.0}
        });
    }

    public PowTestJunit(double a, double b, double expD, double deltaD) {
        this.valueOne = a;
        this.valueTwo = b;
        this.expected = expD;
        this.delta = deltaD;
    }

    @Test
    public void testPow() {
        double result = calculator.pow(valueOne, valueTwo);
        Assert.assertEquals(expected, result, delta);
    }

}
