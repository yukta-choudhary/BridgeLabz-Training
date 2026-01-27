package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.main.TemperatureConverter;

class TemperatureConverterTest {

    TemperatureConverter tc = new TemperatureConverter();

    @Test
    void testCtoF() {
        assertEquals(32, tc.celsiusToFahrenheit(0));
    }

    @Test
    void testFtoC() {
        assertEquals(0, tc.fahrenheitToCelsius(32));
    }
}

