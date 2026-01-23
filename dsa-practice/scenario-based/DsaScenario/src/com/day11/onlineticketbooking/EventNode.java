package com.day11.onlineticketbooking;
class EventNode {
    int time;
    String event;
    int height;
    EventNode left, right;

    EventNode(int time, String event) {
        this.time = time;
        this.event = event;
        height = 1;
    }
}

