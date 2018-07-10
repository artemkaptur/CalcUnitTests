package com.epam.calculator.tests.factory;

import com.epam.calculator.tests.DivTest;
import org.testng.annotations.Factory;

public class DivTestFactory {
    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new DivTest(0, 0, 0,0,0,0)
        };
    }
}
