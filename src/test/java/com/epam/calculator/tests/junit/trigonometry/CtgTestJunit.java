package com.epam.calculator.tests.junit.trigonometry;

import com.epam.calculator.tests.junit.BaseCalculatorTestJunit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class CtgTestJunit extends BaseCalculatorTestJunit {
    private double valueOne;

    private double expected;

    private double delta;

    @Parameterized.Parameters
    public static Collection ctgParam() {
        return Arrays.asList(new Object[][]{
                {Math.PI / 6, 1.732d, 0.0},
                {Math.PI / 4, 1d, 0.0},
                {Math.PI / 3, 0.5773d, 0.0},
                {Math.PI / 2, 0d, 0.0},
                {Math.PI / 3 * 2, -0.5773d, 0.0},
                {Math.PI / 4 * 3, -1d, 0.0},
                {Math.PI / 6 * 5, -1.732d, 0.0},
                {Math.PI / 6 * 7, 1.732d, 0.0},
                {Math.PI / 4 * 5, 1d, 0.0},
                {Math.PI / 3 * 4, 0.5773d, 0.0},
                {Math.PI / 2 * 3, 0d, 0.0},
                {Math.PI / 3 * 5, -0.5773d, 0.0},
                {Math.PI / 4 * 7, -1d, 0.0},
                {Math.PI / 6 * 11, -1.732d, 0.0}
        });
    }

    public CtgTestJunit(double a, double expected, double delta) {
        this.valueOne = a;
        this.expected = expected;
        this.delta = delta;
    }

    @Test
    public void testCtg() {
        double result = calculator.ctg(valueOne);
        Assert.assertEquals(expected, round(result), delta);
    }

}
