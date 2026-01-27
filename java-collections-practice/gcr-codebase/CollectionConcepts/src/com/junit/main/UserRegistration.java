package com.junit.main;
public class UserRegistration {

    public void registerUser(String u, String e, String p) {
        if (u.isEmpty() || e.isEmpty() || p.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }
}
