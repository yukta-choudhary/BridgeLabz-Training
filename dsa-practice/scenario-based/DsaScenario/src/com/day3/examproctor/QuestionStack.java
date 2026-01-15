package com.day3.examproctor;
public class QuestionStack {
    private StackNode top;

    public QuestionStack() {
        top = null;
    }

    // Push question onto stack
    public void push(int qid) {
        StackNode newNode = new StackNode(qid);
        newNode.next = top;
        top = newNode;
    }

    // Pop last visited question
    public int pop() {
        if (top == null) {
            System.out.println("No questions in history!");
            return -1;
        }
        int qid = top.questionId;
        top = top.next;
        return qid;
    }

    // Peek last visited question
    public int peek() {
        if (top == null) return -1;
        return top.questionId;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
