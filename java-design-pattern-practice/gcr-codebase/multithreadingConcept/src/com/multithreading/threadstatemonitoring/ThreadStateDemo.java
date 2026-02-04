package com.multithreading.threadstatemonitoring;
/*
Problem 4: Thread State Monitoring
Main class
*/

public class ThreadStateDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(new TaskRunner(), "Task-1");
        Thread t2 = new Thread(new TaskRunner(), "Task-2");

        StateMonitor monitor = new StateMonitor(t1, t2);

        monitor.start();
        t1.start();
        t2.start();
    }
}
