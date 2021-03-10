package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	OddThread oddThread = new OddThread("odd thread");
	EvenThread evenThread = new EvenThread("even thread");
	oddThread.start();
	oddThread.join();
	evenThread.start();
    }
}
