package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class JavaThreadPool {

    public static void main(String args[]) {
        ExecutorService tpe = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            tpe.execute(new JavaThreadPoolByRunnableInterface());
        }
        tpe.shutdown();
        while (!tpe.isTerminated()) {

        }
        System.out.println("Finished all threads");
    }
}