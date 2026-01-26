package com.annotations.usetaskinfo;

//Read annotation using reflection

import java.lang.reflect.Method;

public class TaskProcessor {
 public static void main(String[] args) throws Exception {

     TaskManager tm = new TaskManager();
     Method m = tm.getClass().getMethod("completeTask");

     TaskInfo info = m.getAnnotation(TaskInfo.class);

     System.out.println(info.priority());
     System.out.println(info.assignedTo());
 }
}
