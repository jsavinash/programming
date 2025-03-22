package com.thread;

class JavaThreadGroup extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("ThreadGroup" + Thread.currentThread().getThreadGroup());
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        ThreadGroup tg = new ThreadGroup("demo");
        Thread t1 = new Thread(tg, new JavaThreadGroup(), "thread-1");
        Thread t2 = new Thread(tg, new JavaThreadGroup(), "thread-2");
        Thread t3 = new Thread(tg, new JavaThreadGroup(), "thread-3");
        Thread t4 = new Thread(tg, new JavaThreadGroup(), "thread-4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}