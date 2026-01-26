package com.annotations.useimportantmethod;

import java.lang.reflect.Method;

public class DemoImportant {

    @ImportantMethod
    public void save() {}

    @ImportantMethod(level = "LOW")
    public void load() {}

    public static void main(String[] args) {

        for (Method m : DemoImportant.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " : " + im.level());
            }
        }
    }
}

