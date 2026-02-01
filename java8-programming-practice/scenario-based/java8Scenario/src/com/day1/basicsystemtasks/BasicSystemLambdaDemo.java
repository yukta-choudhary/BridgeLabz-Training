package com.day1.basicsystemtasks;

import java.util.*;
import java.util.function.*;

public class BasicSystemLambdaDemo {

    public static void main(String[] args) {

        /* 1. Run a task in a separate thread */
        System.out.println("Running task in separate thread:");
        Runnable task = () -> System.out.println("Task is running using lambda thread");
        new Thread(task).start();

        /* 2. Print numbers from a list */
        System.out.println("\nPrinting numbers from list:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(n -> System.out.println(n));

        /* 3. Check if number is even or odd */
        System.out.println("\nEven or Odd Check:");
        Predicate<Integer> evenCheck = n -> n % 2 == 0;
        System.out.println("10 is even? " + evenCheck.test(10));
        System.out.println("7 is even? " + evenCheck.test(7));

        /* 4. Add two numbers */
        System.out.println("\nAddition using lambda:");
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Sum of 5 and 6: " + add.apply(5, 6));

        /* 5. Find greater of two numbers */
        System.out.println("\nGreater number:");
        BiFunction<Integer, Integer, Integer> greater =
                (a, b) -> a > b ? a : b;
        System.out.println("Greater between 10 and 20: " + greater.apply(10, 20));
    }
}
