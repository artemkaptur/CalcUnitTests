package com.epam.calculator.tests.testng;

import com.epam.tat.module4.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

import java.util.Date;

public class BaseCalculatorTest {

    protected Calculator calculator;
    private static Logger logger = LogManager.getLogger();

    @BeforeSuite
    public void bs() {
        logger.info("Before suite");
    }

    @Parameters({"setup-message"})
    @BeforeClass(alwaysRun = true)
    public void setUp(@Optional(value = "Config prepare calculator") String setupMessage) {
        logger.info(setupMessage);
        calculator = new Calculator();
    }

    @AfterSuite
    public void as() {
        logger.info("After suite");
    }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }

    protected double round(double value) {
        return (double) Math.round(value * 10000d) / 10000d;
    }

}
