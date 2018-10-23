package com.epam.calculator.tests.junit.trigonometry;

import com.epam.calculator.tests.junit.BaseCalculatorTestJunit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TgTestJunit extends BaseCalculatorTestJunit {
    private double valueOne;

    private double expected;

    private double delta;

    @Parameterized.Parameters
    public static Collection tgParam() {
        return Arrays.asList(new Object[][]{
                {0, 0d, 0.0},
                {Math.PI / 6, 0.5773d, 0.0},
                {Math.PI / 4, 1d, 0.0},
                {Math.PI / 3, 1.732d, 0.0},
                {Math.PI / 3 * 2, -0.5773d, 0.0},
                {Math.PI / 4 * 3, -1d, 0.0},
                {Math.PI / 6 * 5, -1.732d, 0.0},
                {Math.PI, 0d, 0.0},
                {Math.PI / 6 * 7, 0.5773d, 0.0},
                {Math.PI / 4 * 5, 1d, 0.0},
                {Math.PI / 3 * 4, 1.732d, 0.0},
                {Math.PI / 3 * 5, -1.732d, 0.0},
                {Math.PI / 4 * 7, -1d, 0.0},
                {Math.PI / 6 * 11, -0.5773d, 0.0}
        });
    }

    public TgTestJunit(double a, double expected, double delta) {
        this.valueOne = a;
        this.expected = expected;
        this.delta = delta;
    }

    @Test
    public void testTg() {
        double result = calculator.tg(valueOne);
        Assert.assertEquals(expected, round(result), delta);
    }

}
