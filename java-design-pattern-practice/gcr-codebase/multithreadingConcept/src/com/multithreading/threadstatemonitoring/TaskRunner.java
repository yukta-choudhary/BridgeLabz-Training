package com.multithreading.threadstatemonitoring;
/*
Problem 4: Thread State Monitoring
TaskRunner class
*/

public class TaskRunner implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000); // TIMED_WAITING
            for (int i = 0; i < 1000000; i++) { } // RUNNABLE
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
