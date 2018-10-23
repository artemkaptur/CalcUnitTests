package com.epam.calculator.runner;

import com.epam.calculator.listener.MySuiteListener;
import com.epam.calculator.listener.MyTestListener;
import org.testng.ITestNGListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        TestNG tng = new TestNG();

        tng.addListener((ITestNGListener) new TestListenerAdapter());
        tng.addListener((ITestNGListener) new MySuiteListener());
        tng.addListener((ITestNGListener) new MyTestListener());

        XmlSuite suite = new XmlSuite();
        suite.setName("MySuite");

        List<String> files = new ArrayList<>();
        files.addAll(new ArrayList<String>() {{
            add("./src/test/resources/suites/run-all-factory.xml");
        }});
        suite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        tng.setXmlSuites(suites);

        tng.run();
    }
}
