package com.company;

/**
 * Created by kruczjak on 3/25/15.
 */
public class Outer extends Thread {
    final private int number;
    final private Synchronizer synchronizer;

    public Outer(int number, Synchronizer synchronizer) {
        this.number = number;
        this.synchronizer = synchronizer;
    }

    @Override
    public void run() {
        while(true)
            synchronizer.print(number);
    }

    public int getNumber() {
        return number;
    }
}
