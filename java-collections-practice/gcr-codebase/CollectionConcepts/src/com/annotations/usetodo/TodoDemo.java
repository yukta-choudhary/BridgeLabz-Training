package com.annotations.usetodo;
import java.lang.reflect.Method;

public class TodoDemo {

    @Todo(task = "Fix bug", assignedTo = "Dev1")
    public void fixBug() {}

    @Todo(task = "Add feature", assignedTo = "Dev2", priority = "HIGH")
    public void addFeature() {}

    public static void main(String[] args) {

        for (Method m : TodoDemo.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(t.task() + " - " + t.priority());
            }
        }
    }
}

