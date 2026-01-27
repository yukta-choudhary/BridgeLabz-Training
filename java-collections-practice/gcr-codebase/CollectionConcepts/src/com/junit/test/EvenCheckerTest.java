package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.junit.main.EvenChecker;

class EvenCheckerTest {

    EvenChecker ec = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int n) {
        assertEquals(n % 2 == 0, ec.isEven(n));
    }
}

