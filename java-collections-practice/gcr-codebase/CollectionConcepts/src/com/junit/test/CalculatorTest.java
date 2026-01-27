package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.junit.main.Calculator;

// JUnit test class
class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, cal.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, cal.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, cal.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> cal.divide(10, 0));
    }
}

