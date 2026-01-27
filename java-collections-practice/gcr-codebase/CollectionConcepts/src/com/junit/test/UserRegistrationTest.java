package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.main.UserRegistration;

class UserRegistrationTest {

    UserRegistration ur = new UserRegistration();

    @Test
    void testInvalidUser() {
        assertThrows(IllegalArgumentException.class,
                () -> ur.registerUser("", "", ""));
    }
}
