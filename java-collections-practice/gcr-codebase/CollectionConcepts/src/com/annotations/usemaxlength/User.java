package com.annotations.usemaxlength;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {

    @MaxLength(5)
    String username;

    User(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("Too long");
        }
        username = name;
    }
}
