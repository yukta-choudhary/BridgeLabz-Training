package com.junit.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.main.PasswordValidator;

class PasswordValidatorTest {

    PasswordValidator pv = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(pv.validate("Abcd1234"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(pv.validate("abc"));
    }
}
