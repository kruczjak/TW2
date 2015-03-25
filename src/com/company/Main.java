package com.company;

public class Main {
    private static final int N = 100;

    public static void main(String[] args) {
        Synchronizer synchronizer = new Synchronizer(N);
        for(int i=1; i<=N; i++)
            new Outer(i, synchronizer).start();
    }
    /* do pokazania na następnych
    * zrobić 3 wątki (lub n), wypisują kolejne liczby (1 - 1, 2 - 2, 3 - 3), mogą to robić 10, 100x
    * zaimplementować koordynację waitem i notifyiem aby zawsze było to w kolejności 123123123123....*/
}
