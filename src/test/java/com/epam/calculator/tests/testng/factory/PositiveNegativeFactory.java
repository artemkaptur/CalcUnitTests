package com.epam.calculator.tests.testng.factory;

import com.epam.calculator.tests.testng.logicoperations.PositiveNegativeTest;
import org.testng.annotations.Factory;

public class PositiveNegativeFactory {

    @Factory
    public Object [] generateTests() {
        return new Object[] {
                new PositiveNegativeTest(0, false, false)
        };
    }
}
