package com.multithreading.printshopjobscheduler;
/*
Problem 5: Print Shop Job Scheduler
Runnable job class
*/

public class PrintJob implements Runnable {

    private String jobName;
    private int pages;

    public PrintJob(String jobName, int pages) {
        this.jobName = jobName;
        this.pages = pages;
    }

    @Override
    public void run() {

        long start = System.currentTimeMillis();

        for (int i = 1; i <= pages; i++) {
            System.out.println("Printing " + jobName +
                    " - Page " + i + " of " + pages);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(jobName + " completed in " + (end - start) + " ms");
    }
}
