package com.thread;

class JavaThreadSleep extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        JavaThreadSleep t = new JavaThreadSleep();
        JavaThreadSleep t2 = new JavaThreadSleep();
        t.start();
        t2.start();
    }
}