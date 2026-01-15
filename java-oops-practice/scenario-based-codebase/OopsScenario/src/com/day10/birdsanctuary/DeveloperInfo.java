package com.day10.birdsanctuary;

import java.lang.annotation.*;

//Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DeveloperInfo {
 String name();
 String version();
}
