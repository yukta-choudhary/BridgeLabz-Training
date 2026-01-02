package com.singlylinkedlist.socialmediaconnections;

//Main class to test Social Media Friend Connections

import java.util.Scanner;

public class SocialMediaMain {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     SocialMediaLinkedList list = new SocialMediaLinkedList();
     int choice;

     do {
         System.out.println(
             "\n1.Add User\n2.Add Friend\n3.Remove Friend\n4.Display Friends" +
             "\n5.Mutual Friends\n6.Search by ID\n7.Search by Name\n8.Count Friends\n0.Exit"
         );

         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 list.addUser(sc.nextInt(), sc.next(), sc.nextInt());
                 break;

             case 2:
                 list.addFriend(sc.nextInt(), sc.nextInt());
                 break;

             case 3:
                 list.removeFriend(sc.nextInt(), sc.nextInt());
                 break;

             case 4:
                 list.displayFriends(sc.nextInt());
                 break;

             case 5:
                 list.mutualFriends(sc.nextInt(), sc.nextInt());
                 break;

             case 6:
                 UserNode u1 = list.findUserById(sc.nextInt());
                 System.out.println(u1 != null ? u1.name : "Not found");
                 break;

             case 7:
                 UserNode u2 = list.findUserByName(sc.next());
                 System.out.println(u2 != null ? u2.userId : "Not found");
                 break;

             case 8:
                 list.countFriends(sc.nextInt());
                 break;
         }

     } while (choice != 0);

     sc.close();
 }
}

