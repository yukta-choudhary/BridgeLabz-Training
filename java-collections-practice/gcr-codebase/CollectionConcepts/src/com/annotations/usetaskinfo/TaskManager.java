package com.annotations.usetaskinfo;

//Task manager class
public class TaskManager {

 @TaskInfo(priority = "HIGH", assignedTo = "Yukta")
 public void completeTask() {
     System.out.println("Task completed");
 }
}
