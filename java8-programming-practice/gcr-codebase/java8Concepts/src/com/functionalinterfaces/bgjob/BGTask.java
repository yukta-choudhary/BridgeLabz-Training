package com.functionalinterfaces.bgjob;


public class BGTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Background task started...");
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Background task completed!");
    }
}
