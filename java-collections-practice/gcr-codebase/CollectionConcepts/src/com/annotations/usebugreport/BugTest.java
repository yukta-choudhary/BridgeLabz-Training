package com.annotations.usebugreport;
import java.lang.reflect.Method;

public class BugTest {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance issue")
    public void process() {
        System.out.println("Processing");
    }

    public static void main(String[] args) throws Exception {

        Method m = BugTest.class.getMethod("process");
        BugReport[] bugs = m.getAnnotationsByType(BugReport.class);

        for (BugReport b : bugs) {
            System.out.println(b.description());
        }
    }
}

