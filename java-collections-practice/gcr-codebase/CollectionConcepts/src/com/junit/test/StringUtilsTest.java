package com.junit.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.main.StringUtils;

class StringUtilsTest {

    StringUtils su = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("avaJ", su.reverse("Java"));
    }

    @Test
    void testPalindrome() {
        assertTrue(su.isPalindrome("madam"));
    }

    @Test
    void testUpperCase() {
        assertEquals("HELLO", su.toUpperCase("hello"));
    }
}
