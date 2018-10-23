package com.epam.calculator.tests.testng.factory;

import com.epam.calculator.tests.testng.arithmeticoperations.DivTest;
import org.testng.annotations.Factory;

public class DivTestFactory {

    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new DivTest(0, 0, 0,0,0,0)
        };
    }
}
