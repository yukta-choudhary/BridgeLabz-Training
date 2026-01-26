package com.annotations.uselogexecutiontime;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

public class LogDemo {

    @LogExecutionTime
    public void work() throws Exception {
        Thread.sleep(100);
    }

    public static void main(String[] args) throws Exception {

        LogDemo d = new LogDemo();
        Method m = d.getClass().getMethod("work");

        if (m.isAnnotationPresent(LogExecutionTime.class)) {
            long start = System.nanoTime();
            d.work();
            long end = System.nanoTime();
            System.out.println("Time: " + (end - start));
        }
    }
}

