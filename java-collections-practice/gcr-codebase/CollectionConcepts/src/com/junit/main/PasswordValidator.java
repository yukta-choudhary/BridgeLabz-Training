package com.junit.main;

public class PasswordValidator {

    public boolean validate(String pwd) {
        return pwd.length() >= 8 &&
               pwd.matches(".*[A-Z].*") &&
               pwd.matches(".*\\d.*");
    }
}

