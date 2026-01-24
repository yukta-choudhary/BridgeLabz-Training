package com.day2.chatlog;

interface MessageFilter<T> {
    boolean filter(T msg);
}

