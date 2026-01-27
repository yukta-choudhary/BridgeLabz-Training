package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.main.ExceptionDemo;

class ExceptionDemoTest {

    ExceptionDemo ed = new ExceptionDemo();

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> ed.divide(10, 0));
    }
}

