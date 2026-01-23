package com.day11.gamingapp;

import java.util.Scanner;

public class GamingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeaderboardAVL avl = new LeaderboardAVL();
        PlayerNode root = null;

        int ch;
        do {
            System.out.println("\n1.Insert/Update 2.Display Top 3.Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                sc.nextLine();
                System.out.print("Enter Player Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Score: ");
                int score = sc.nextInt();
                root = avl.insert(root, name, score);
            } else if (ch == 2) {
                System.out.println("Leaderboard:");
                avl.showTopPlayers(root);
            }
        } while (ch != 3);
    }
}
