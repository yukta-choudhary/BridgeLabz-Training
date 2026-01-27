package com.junit.main;

public class DateFormatter {

    public String formatDate(String date) {
        String[] parts = date.split("-");
        return parts[2] + "-" + parts[1] + "-" + parts[0];
    }
}

