package com.doublylinkedlist.texteditor;

//Main class for Text Editor Undo / Redo

import java.util.Scanner;

public class TextEditorMain {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     UndoRedoLinkedList editor = new UndoRedoLinkedList();
     int choice;

     do {
         System.out.println(
             "\n1.Add Text\n2.Undo\n3.Redo\n4.Show Current\n0.Exit"
         );

         choice = sc.nextInt();
         sc.nextLine(); // clear buffer

         switch (choice) {
             case 1:
                 editor.addState(sc.nextLine());
                 break;

             case 2:
                 editor.undo();
                 break;

             case 3:
                 editor.redo();
                 break;

             case 4:
                 editor.displayCurrent();
                 break;
         }

     } while (choice != 0);

     sc.close();
 }
}
