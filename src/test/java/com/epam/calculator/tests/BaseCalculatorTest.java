package com.epam.calculator.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

import java.util.Date;

public class BaseCalculatorTest {

    protected Calculator calculator;

//    @BeforeSuite
//    public void bs() {
//        System.out.println("Before suite");
//    }
//
//    @BeforeClass
//    public void bc() {
//        System.out.println("Before class");
//    }
//
//    @BeforeMethod
//    public void bm() {
//        System.out.println("Before method");
//    }
//
//    @BeforeGroups(value = "a")
//    public void bg() {
//        System.out.println("Before groups");
//    }

    @BeforeClass
    public void setUp() {
        System.out.println("Config prepare calculator");
        calculator = new Calculator();
    }

//    @AfterMethod
//    public void am() {
//        System.out.println("After method");
//    }
//
//    @AfterClass
//    public void ac() {
//        System.out.println("After class");
//    }
//
//    @AfterSuite
//    public void as() {
//        System.out.println("After suite");
//    }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }

}
