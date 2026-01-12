package com.day2.texteditor;

/*
TextEditor – Undo/Redo Functionality
Main class
*/

import java.util.Scanner;

class TextEditorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();
        int choice;

        do {
            System.out.println("\n1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Undo");
            System.out.println("4.Redo");
            System.out.println("5.Show Text");
            System.out.println("6.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter text: ");
                    editor.insert(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter characters to delete: ");
                    editor.delete(sc.nextInt());
                    sc.nextLine();
                    break;

                case 3:
                    editor.undo();
                    break;

                case 4:
                    editor.redo();
                    break;

                case 5:
                    editor.show();
                    break;
            }

        } while (choice != 6);

        sc.close();
    }
}

