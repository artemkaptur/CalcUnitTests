package com.epam.calculator.runner;

import com.epam.calculator.listener.MySuiteListener;
import com.epam.calculator.listener.MyTestListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        TestNG tng = new TestNG();

        tng.addListener(new TestListenerAdapter());
        tng.addListener(new MySuiteListener());
        tng.addListener(new MyTestListener());

        XmlSuite suite = new XmlSuite();
        suite.setName("TmpSuite");

        List<String> files = new ArrayList<>();
        files.addAll(new ArrayList<String>() {{
            add("./src/test/resources/suites/simplesuite.xml");
//            add("./src/test/resources/suites/parallel.xml");
        }});
        suite.setSuiteFiles(files);
//        suite.setParallel(XmlSuite.ParallelMode.METHODS);
//        suite.setThreadCount(4);


        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        tng.setXmlSuites(suites);

        tng.run();
    }
}
