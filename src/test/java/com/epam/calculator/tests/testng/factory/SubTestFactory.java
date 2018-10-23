package com.epam.calculator.tests.testng.factory;

import com.epam.calculator.tests.testng.arithmeticoperations.SubTest;
import org.testng.annotations.Factory;

public class SubTestFactory {

    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new SubTest(0, 0, 0,0,0,0)
        };
    }
}
