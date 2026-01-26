package com.annotations.usetaskinfo;
//Custom annotation

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TaskInfo {
 String priority();
 String assignedTo();
}
