package com.Anudip;

public class EvenOddPrinter {

    private static final int MAX_NUMBER = 20;
    private static Object lock = new Object();
    private static boolean isEvenTurn = true;

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        evenThread.start();
        oddThread.start();
    }

    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= MAX_NUMBER; i += 2) {
                synchronized (lock) {
                    while (!isEvenTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    isEvenTurn = false;
                    lock.notify();
                }
            }
        }
    }

    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= MAX_NUMBER; i += 2) {
                synchronized (lock) {
                    while (isEvenTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    isEvenTurn = true;
                    lock.notify();
                }
            }
        }
    }
}

/*
Thread-1: 13
Thread-0: 16
Thread-1: 15
Thread-0: 18
Thread-1: 17
Thread-0: 20
Thread-1: 19 
*/


