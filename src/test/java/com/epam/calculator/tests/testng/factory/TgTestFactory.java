package com.epam.calculator.tests.testng.factory;

import com.epam.calculator.tests.testng.trigonometry.TgTest;
import org.testng.annotations.Factory;

public class TgTestFactory {

    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new TgTest(Math.PI / 6*7, 0.5773d),
                new TgTest(Math.PI / 4*5, 1d),
                new TgTest(Math.PI / 3*4, 1.732d),
                new TgTest(Math.PI / 3*5, -1.732d),
                new TgTest(Math.PI / 4*7, -1d),
                new TgTest(Math.PI / 6*11, -0.5773d)

        };
    }
}
