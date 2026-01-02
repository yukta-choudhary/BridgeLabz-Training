package com.singlylinkedlist.socialmediaconnections;
//Node for User Linked List

class UserNode {
 int userId;
 String name;
 int age;
 FriendNode friends;   // Friend list head
 UserNode next;

 UserNode(int userId, String name, int age) {
     this.userId = userId;
     this.name = name;
     this.age = age;
     this.friends = null;
     this.next = null;
 }
}

