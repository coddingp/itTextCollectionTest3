package com.itTextCollectionTest3.src.com.company;

public class Main {
    private static long prev = 0;
    private static long current = 1;

    public static void main(String[] args) {
        Thread th1 = new Thread(new Calculator(prev, current, 0));
        Thread th2 = new Thread(new Calculator(prev, current * 100, 0));
        th1.start();
        th2.start();
    }

    public static synchronized void calcFibonacciMain() {
        long next = prev + current;
        prev = current;
        current = next;
        System.out.println(current);
    }

    private static class calcFibonacciRunner implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                calcFibonacciMain();
            }
        }
    }
}