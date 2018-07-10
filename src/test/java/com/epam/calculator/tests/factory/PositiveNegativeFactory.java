package com.epam.calculator.tests.factory;

import com.epam.calculator.tests.PositiveNegativeTest;
import org.testng.annotations.Factory;

public class PositiveNegativeFactory {
    @Factory
    public Object [] getTests() {
        return new Object[] {
                new PositiveNegativeTest(0, false, false)
        };
    }
}
