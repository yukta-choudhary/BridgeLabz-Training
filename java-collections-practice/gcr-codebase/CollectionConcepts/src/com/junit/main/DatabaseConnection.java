package com.junit.main;
public class DatabaseConnection {

    public boolean connected;

    public void connect() {
        connected = true;
    }

    public void disconnect() {
        connected = false;
    }
}
