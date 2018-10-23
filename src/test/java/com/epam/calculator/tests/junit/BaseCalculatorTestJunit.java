package com.epam.calculator.tests.junit;

import com.epam.tat.module4.Calculator;
import org.junit.BeforeClass;

import java.util.Date;

public class BaseCalculatorTestJunit {

    protected static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        System.out.println("Config prepare calculator");
        calculator = new Calculator();
    }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }

    protected double round(double value) {
        return (double)Math.round(value * 10000d) / 10000d;
    }
}
