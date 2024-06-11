package com.synchronization;

class JavaSynchronizedStaticMethodResource {
    synchronized static void printNumbers(int n) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}