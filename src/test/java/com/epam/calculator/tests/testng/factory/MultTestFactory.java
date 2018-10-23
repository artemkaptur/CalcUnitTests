package com.epam.calculator.tests.testng.factory;

import com.epam.calculator.tests.testng.arithmeticoperations.MultTest;
import org.testng.annotations.Factory;

public class MultTestFactory {

    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new MultTest(0, 0, 0,0,0,0)
        };
    }
}
