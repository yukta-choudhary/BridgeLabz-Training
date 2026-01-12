package com.day2.texteditor;

//Stack class using array
class Stack {

 String[] arr = new String[50];
 int top = -1;

 // Push operation
 void push(String data) {
     arr[++top] = data;
 }

 // Pop operation
 String pop() {
     if (top == -1)
         return null;
     return arr[top--];
 }

 // Check empty
 boolean isEmpty() {
     return top == -1;
 }
}
