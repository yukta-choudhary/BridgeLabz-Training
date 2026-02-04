package com.multithreading.restaurantorderprocessing;
/*
Problem 3: Restaurant Order Processing
Chef thread class
*/

public class Chef extends Thread {

    private String dish;
    private int cookTime;

    public Chef(String name, String dish, int cookTime) {
        super(name);
        this.dish = dish;
        this.cookTime = cookTime;
    }

    @Override
    public void run() {

        System.out.println(getName() + " started preparing " + dish);

        int[] progress = {25, 50, 75, 100};

        for (int p : progress) {
            try {
                Thread.sleep(cookTime / 4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " preparing " + dish + ": " + p + "% complete");
        }
    }
}
