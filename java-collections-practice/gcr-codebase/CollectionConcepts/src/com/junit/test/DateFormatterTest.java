package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.main.DateFormatter;

class DateFormatterTest {

    DateFormatter df = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("31-01-2025", df.formatDate("2025-01-31"));
    }
}
