package com.streamapi.welcomemessage;

import java.util.List;

public class WelcomeMain {

    public static void main(String[] args) {

        List<String> attendees = List.of(
                "John",
                "Will",
                "Steve",
                "Barb",
                "Vicky"
        );

        attendees.stream()
                .forEach(name -> 
                        System.out.println("Welcome to the event, " + name + "!"));
    }
}
