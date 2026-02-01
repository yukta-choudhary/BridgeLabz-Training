package com.streamapi.emailnotifications;

import java.util.List;

public class EmailMain {

    public static void main(String[] args) {

        List<String> emails = List.of(
                "user1@gmail.com",
                "user2@gmail.com",
                "user3@gmail.com"
        );

        emails.forEach(email -> sendEmailNotification(email));
    }

    public static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }
}
