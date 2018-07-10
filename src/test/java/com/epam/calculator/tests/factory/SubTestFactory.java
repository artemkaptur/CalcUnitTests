package com.epam.calculator.tests.factory;

import com.epam.calculator.tests.SubTest;
import org.testng.annotations.Factory;

public class SubTestFactory {
    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new SubTest(0, 0, 0,0,0,0)
        };
    }
}
