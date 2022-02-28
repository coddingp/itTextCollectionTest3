package com.itTextCollectionTest3.src.com.company;

import java.util.Objects;

public class Print implements Runnable {
    private int n = 0;
    private String a = "";

    public Print(int n, String a) {
        this.n = n;
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    synchronized void print(int n, String a) {
        for (int i = 0; i < n; i++) {
            System.out.println(a);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Print print = (Print) o;
        return n == print.n;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n);
    }


    @Override
    public String toString() {
        return "Print{" +
                "n=" + n +
                '}';
    }

    @Override
    public void run() {
        print(n, a);
    }

}
