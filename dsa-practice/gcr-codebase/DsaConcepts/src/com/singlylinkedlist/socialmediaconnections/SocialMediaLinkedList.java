package com.singlylinkedlist.socialmediaconnections;

//Singly Linked List for Social Media Users

class SocialMediaLinkedList {
 UserNode head;

 // Add new user
 void addUser(int id, String name, int age) {
     UserNode newNode = new UserNode(id, name, age);
     newNode.next = head;
     head = newNode;
 }

 // Find user by ID
 UserNode findUserById(int id) {
     UserNode temp = head;
     while (temp != null) {
         if (temp.userId == id)
             return temp;
         temp = temp.next;
     }
     return null;
 }

 // Find user by name
 UserNode findUserByName(String name) {
     UserNode temp = head;
     while (temp != null) {
         if (temp.name.equalsIgnoreCase(name))
             return temp;
         temp = temp.next;
     }
     return null;
 }

 // Add friend connection
 void addFriend(int id1, int id2) {
     UserNode u1 = findUserById(id1);
     UserNode u2 = findUserById(id2);

     if (u1 == null || u2 == null) {
         System.out.println("User not found");
         return;
     }

     addFriendToList(u1, id2);
     addFriendToList(u2, id1);
     System.out.println("Friend connection added");
 }

 // Helper: add friend ID
 void addFriendToList(UserNode user, int fid) {
     FriendNode newFriend = new FriendNode(fid);
     newFriend.next = user.friends;
     user.friends = newFriend;
 }

 // Remove friend connection
 void removeFriend(int id1, int id2) {
     UserNode u1 = findUserById(id1);
     UserNode u2 = findUserById(id2);

     if (u1 == null || u2 == null) {
         System.out.println("User not found");
         return;
     }

     removeFriendFromList(u1, id2);
     removeFriendFromList(u2, id1);
     System.out.println("Friend connection removed");
 }

 // Helper: remove friend ID
 void removeFriendFromList(UserNode user, int fid) {
     FriendNode temp = user.friends;
     FriendNode prev = null;

     while (temp != null) {
         if (temp.friendId == fid) {
             if (prev == null)
                 user.friends = temp.next;
             else
                 prev.next = temp.next;
             return;
         }
         prev = temp;
         temp = temp.next;
     }
 }

 // Display friends of a user
 void displayFriends(int id) {
     UserNode user = findUserById(id);

     if (user == null) {
         System.out.println("User not found");
         return;
     }

     System.out.println("Friends of " + user.name + ":");
     FriendNode temp = user.friends;

     if (temp == null) {
         System.out.println("No friends");
         return;
     }

     while (temp != null) {
         System.out.println(temp.friendId);
         temp = temp.next;
     }
 }

 // Find mutual friends
 void mutualFriends(int id1, int id2) {
     UserNode u1 = findUserById(id1);
     UserNode u2 = findUserById(id2);

     if (u1 == null || u2 == null) {
         System.out.println("User not found");
         return;
     }

     System.out.println("Mutual Friends:");
     FriendNode f1 = u1.friends;

     while (f1 != null) {
         FriendNode f2 = u2.friends;
         while (f2 != null) {
             if (f1.friendId == f2.friendId) {
                 System.out.println(f1.friendId);
             }
             f2 = f2.next;
         }
         f1 = f1.next;
     }
 }

 // Count number of friends
 void countFriends(int id) {
     UserNode user = findUserById(id);

     if (user == null) {
         System.out.println("User not found");
         return;
     }

     int count = 0;
     FriendNode temp = user.friends;

     while (temp != null) {
         count++;
         temp = temp.next;
     }

     System.out.println("Total friends: " + count);
 }
}
