package com.day11.onlineticketbooking;
import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventAVL avl = new EventAVL();
        EventNode root = null;

        int ch;
        do {
            System.out.println("\n1.Add Event 2.Show Events 3.Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter Time: ");
                int time = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Event Name: ");
                String name = sc.nextLine();
                root = avl.insert(root, time, name);
            } else if (ch == 2) {
                System.out.println("Upcoming Events:");
                avl.inorder(root);
            }
        } while (ch != 3);
    }
}
