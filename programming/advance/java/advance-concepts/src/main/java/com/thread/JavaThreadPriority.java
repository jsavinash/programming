package com.thread;

class JavaThreadPriority extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thread name :-" + Thread.currentThread().getName());
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        JavaThreadPriority jtp = new JavaThreadPriority();
        jtp.setName("thread-1");
        JavaThreadPriority jtp2 = new JavaThreadPriority();
        jtp2.setName("thread-2");
        JavaThreadPriority jtp3 = new JavaThreadPriority();
        jtp3.setName("thread-3");
        jtp3.setPriority(10);

        jtp.start();
        jtp2.start();
        jtp3.start();
    }
}