package com.epam.calculator.tests.testng.factory;

import com.epam.calculator.tests.testng.trigonometry.SinTest;
import org.testng.annotations.Factory;

public class SinTestFactory {

    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new SinTest(Math.PI / 6*7, -0.5d),
                new SinTest(Math.PI / 4*5, -0.7071d),
                new SinTest(Math.PI / 3*4, -0.866d),
                new SinTest(Math.PI / 2*3, -1d),
                new SinTest(Math.PI / 3*5, -0.866d),
                new SinTest(Math.PI / 4*7, -0.7071d),
                new SinTest(Math.PI / 6*11, -0.5d)

        };
    }
}
