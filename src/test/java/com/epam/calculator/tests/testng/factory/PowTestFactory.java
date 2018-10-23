package com.epam.calculator.tests.testng.factory;

import com.epam.calculator.tests.testng.powsqrt.PowTest;
import org.testng.annotations.Factory;

public class PowTestFactory {

    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new PowTest(4, 1.5d, 8d),
                new PowTest(4, -1.5d, 0.125d),
                new PowTest(1.5d, 0.5d, 1.2247d),
                new PowTest(1.5d, -0.5d, 0.8164d)
        };
    }
}
