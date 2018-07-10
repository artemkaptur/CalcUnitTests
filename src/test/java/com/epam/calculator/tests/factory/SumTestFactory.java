package com.epam.calculator.tests.factory;

import com.epam.calculator.tests.SumTest;
import org.testng.annotations.Factory;

public class SumTestFactory {
    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new SumTest(0, 0, 0, 0, 0, 0)
        };
    }
}
