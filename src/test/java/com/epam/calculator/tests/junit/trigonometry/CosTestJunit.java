package com.epam.calculator.tests.junit.trigonometry;

import com.epam.calculator.tests.junit.BaseCalculatorTestJunit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class CosTestJunit extends BaseCalculatorTestJunit {
    private double valueOne;

    private double expected;

    private double delta;

    @Parameterized.Parameters
    public static Collection cosParam() {
        return Arrays.asList(new Object[][]{
                {0, 1d, 0.0},
                {Math.PI / 6, 0.866d, 0.0},
                {Math.PI / 4, 0.7071d, 0.0},
                {Math.PI / 3, 0.5d, 0.0},
                {Math.PI / 2, 0d, 0.0},
                {Math.PI / 3 * 2, 0.5d, 0.0},
                {Math.PI / 4 * 3, 0.7071d, 0.0},
                {Math.PI / 6 * 5, 0.866d, 0.0},
                {Math.PI, -1d, 0.0},
                {Math.PI / 6 * 7, -0.866d, 0.0},
                {Math.PI / 4 * 5, -0.7071d, 0.0},
                {Math.PI / 3 * 4, -0.5d, 0.0},
                {Math.PI / 2 * 3, 0d, 0.0},
                {Math.PI / 3 * 5, 0.5d, 0.0},
                {Math.PI / 4 * 7, 0.7071d, 0.0},
                {Math.PI / 6 * 11, 0.866d, 0.0}
        });
    }

    public CosTestJunit( double a, double expected, double delta){
            this.valueOne = a;
            this.expected = expected;
            this.delta = delta;
        }

        @Test
        public void testCos () {
            double result = calculator.cos(valueOne);
            Assert.assertEquals(expected, round(result), delta);
        }

    }
