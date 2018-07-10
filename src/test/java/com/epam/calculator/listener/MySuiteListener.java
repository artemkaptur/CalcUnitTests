package com.epam.calculator.listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.xml.XmlSuite;

public class MySuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        suite.getXmlSuite().setParallel(XmlSuite.ParallelMode.METHODS);
        suite.getXmlSuite().setThreadCount(4);
    }

    @Override
    public void onFinish(ISuite suite) {

    }
}
