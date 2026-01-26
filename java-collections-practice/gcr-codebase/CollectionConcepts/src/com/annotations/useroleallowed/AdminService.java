package com.annotations.useroleallowed;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteData(String role) {
        if (!role.equals("ADMIN")) {
            System.out.println("Access Denied!");
            return;
        }
        System.out.println("Data deleted");
    }
}

