package com.company;

/**
 * Created by kruczjak on 3/25/15.
 */
public class Synchronizer {
    private final int n;
    private int lastOne = 0;

    public Synchronizer(int n) {
        this.n = n;
    }

    public synchronized void print(int i) {
        while(!(i-lastOne==1 || (lastOne==n && i==1))) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lastOne = i;
        System.out.println(i);
        notifyAll();
    }
}
