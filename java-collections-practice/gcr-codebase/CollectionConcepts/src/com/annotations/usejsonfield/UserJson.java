package com.annotations.usejsonfield;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class UserJson {

    @JsonField(name = "user_name")
    String name = "Yukta";

    public static void main(String[] args) throws Exception {

        UserJson u = new UserJson();
        Field f = u.getClass().getDeclaredField("name");
        JsonField jf = f.getAnnotation(JsonField.class);

        System.out.println("{\"" + jf.name() + "\":\"" + f.get(u) + "\"}");
    }
}
