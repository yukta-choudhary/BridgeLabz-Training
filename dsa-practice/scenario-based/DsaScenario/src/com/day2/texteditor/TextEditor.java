package com.day2.texteditor;

/*
TextEditor class
Manages undo and redo
*/

class TextEditor {

    Stack undoStack = new Stack();
    Stack redoStack = new Stack();
    String text = "";

    // Insert text
    void insert(String value) {
        undoStack.push(text);
        text = text + value;
        redoStack = new Stack(); // clear redo
    }

    // Delete text
    void delete(int len) {
        undoStack.push(text);
        text = text.substring(0, text.length() - len);
        redoStack = new Stack(); // clear redo
    }

    // Undo action
    void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text);
            text = undoStack.pop();
        }
    }

    // Redo action
    void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text);
            text = redoStack.pop();
        }
    }

    // Show text
    void show() {
        System.out.println("Current Text: " + text);
    }
}

