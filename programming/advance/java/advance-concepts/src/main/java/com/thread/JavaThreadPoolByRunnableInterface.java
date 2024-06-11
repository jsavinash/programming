package com.thread;

class JavaThreadPoolByRunnableInterface implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thread name : " + Thread.currentThread().getName());
            System.out.println("Counter " + i);
        }
    }
}