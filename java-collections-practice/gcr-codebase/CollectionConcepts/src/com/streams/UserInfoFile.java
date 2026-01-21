package com.streams;

import java.io.*;

public class UserInfoFile {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("user.txt");

            System.out.print("Enter name: ");
            fw.write("Name: " + br.readLine() + "\n");

            System.out.print("Enter age: ");
            fw.write("Age: " + br.readLine() + "\n");

            System.out.print("Favorite language: ");
            fw.write("Language: " + br.readLine() + "\n");

            fw.close();
            System.out.println("Data saved");

        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}

