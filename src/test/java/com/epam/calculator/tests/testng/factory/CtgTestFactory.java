package com.epam.calculator.tests.testng.factory;

import com.epam.calculator.tests.testng.trigonometry.CtgTest;
import org.testng.annotations.Factory;

public class CtgTestFactory {

    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new CtgTest(Math.PI / 6*7, 1.732d),
                new CtgTest(Math.PI / 4*5, 1d),
                new CtgTest(Math.PI / 3*4, 0.5773d),
                new CtgTest(Math.PI / 2*3, 0d),
                new CtgTest(Math.PI / 3*5, -0.5773d),
                new CtgTest(Math.PI / 4*7, -1d),
                new CtgTest(Math.PI / 6*11, -1.732d)

        };
    }
}
