package com.synchronization;

class JavaSynchronizedBlockResource implements ResourceInterface {
    public void printNumbers(int n) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(Thread.currentThread().getName() + " : " + e);
                }
            }
        }
    }
}