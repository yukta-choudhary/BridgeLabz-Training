package com.streams;
import java.io.*;

class WriterThread extends Thread {
    PipedOutputStream pos;

    WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            pos.write("Hello Thread".getBytes());
            pos.close();
        } catch (IOException e) {}
    }
}

class ReaderThread extends Thread {
    PipedInputStream pis;

    ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {}
    }
}

public class PipedDemo {
    public static void main(String[] args) throws IOException {

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        new WriterThread(pos).start();
        new ReaderThread(pis).start();
    }
}
