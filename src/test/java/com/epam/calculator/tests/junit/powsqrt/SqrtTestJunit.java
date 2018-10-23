package com.epam.calculator.tests.junit.powsqrt;

import com.epam.calculator.tests.junit.BaseCalculatorTestJunit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class SqrtTestJunit extends BaseCalculatorTestJunit {

    private double valueOne;

    private double expected;

    private double delta;

    @Parameterized.Parameters
    public static Collection divParam() {
        return Arrays.asList(new Object[][]{
                {4, 2, 0.0},
                {1.5, 2.25, 0.0}
        });
    }

    public SqrtTestJunit(double a, double expD, double deltaD) {
        this.valueOne = a;
        this.expected = expD;
        this.delta = deltaD;
    }

    @Test
    public void testSqrt() {
        double result = calculator.sqrt(valueOne);
        Assert.assertEquals(expected, result, delta);
    }

}
