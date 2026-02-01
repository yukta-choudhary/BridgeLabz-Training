package com.day2.runnable;

public class RunnableDemo {

    public static void main(String[] args) {

        /* 1. Background task */
        Runnable task1 =
                () -> System.out.println("Background task running");
        new Thread(task1).start();

        /* 2. File cleanup task */
        Runnable cleanup =
                () -> System.out.println("Cleaning temporary files...");
        new Thread(cleanup).start();

        /* 3. Print message in separate thread */
        Runnable message =
                () -> System.out.println("Hello from another thread");
        new Thread(message).start();
    }
}
