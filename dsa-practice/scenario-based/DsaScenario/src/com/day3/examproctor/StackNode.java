package com.day3.examproctor;

public class StackNode {
    int questionId;
    StackNode next;

    public StackNode(int questionId) {
        this.questionId = questionId;
        this.next = null;
    }
}

