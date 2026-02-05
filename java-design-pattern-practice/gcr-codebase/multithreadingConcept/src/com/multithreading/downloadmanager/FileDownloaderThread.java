package com.multithreading.downloadmanager;
/*
Problem 1: Download Manager
Approach 1: Using Thread class
Each file is downloaded in a separate thread.
*/

import java.util.Random;

public class FileDownloaderThread extends Thread {

    private String fileName;

    public FileDownloaderThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int progress = 0; progress <= 100; progress += 25) {
            System.out.println("[" + getName() + "] Downloading " + fileName + ": " + progress + "%");
            try {
                Thread.sleep(200 + random.nextInt(300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
