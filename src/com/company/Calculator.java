package com.itTextCollectionTest3.src.com.company;

import java.util.Objects;

public class Calculator implements Runnable {
    private long previous = 0;
    private long current = 0;
    private long next = 0;

    public Calculator(long previous, long current, long next) {
        this.previous = previous;
        this.current = current;
        this.next = next;
    }

    public long getPrevious() {
        return previous;
    }

    public void setPrevious(long previous) {
        this.previous = previous;
    }

    public long getCurrent() {
        return current;
    }

    public void setCurrent(long current) {
        this.current = current;
    }

    public long getNext() {
        return next;
    }

    public void setNext(long next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return previous == that.previous && current == that.current && next == that.next;
    }

    @Override
    public int hashCode() {
        return Objects.hash(previous, current, next);
    }

    public synchronized void calcFibonacci() {
        this.setNext(this.getPrevious() + this.getCurrent());
        this.setPrevious(this.getCurrent());
        this.setCurrent(this.getNext());
        System.out.println(this.getCurrent());
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            calcFibonacci();
        }
    }
}
