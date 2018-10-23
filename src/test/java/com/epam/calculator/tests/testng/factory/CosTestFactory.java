package com.epam.calculator.tests.testng.factory;

import com.epam.calculator.tests.testng.trigonometry.CosTest;
import org.testng.annotations.Factory;

public class CosTestFactory {

    @Factory
    public Object[] generateTests() {
        return new Object[] {
                new CosTest(Math.PI / 6*7, -0.866d),
                new CosTest(Math.PI / 4*5, -0.7071d),
                new CosTest(Math.PI / 3*4, -0.5d),
                new CosTest(Math.PI / 2*3, 0d),
                new CosTest(Math.PI / 3*5, 0.5d),
                new CosTest(Math.PI / 4*7, 0.7071d),
                new CosTest(Math.PI / 6*11, 0.866d)

        };
    }
}
