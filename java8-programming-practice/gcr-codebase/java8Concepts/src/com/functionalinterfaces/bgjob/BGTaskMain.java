package com.functionalinterfaces.bgjob;


public class BGTaskMain {

    public static void main(String[] args) {

        System.out.println("Main thread started");

        Runnable task = new BGTask();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main thread continues working...");
    }
}
