package com.epam.calculator.tests.testng.factory;

import com.epam.calculator.tests.testng.powsqrt.SqrtTest;
import org.testng.annotations.Factory;

public class SqrtTestFactory {

    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new SqrtTest(2.25, 1.5)
        };
    }
}
