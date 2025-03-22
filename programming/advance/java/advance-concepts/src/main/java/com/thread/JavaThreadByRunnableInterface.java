package com.thread;

class JavaThreadByRunnableInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        JavaThreadByRunnableInterface run = new JavaThreadByRunnableInterface();
        Thread t = new Thread(run, "thread_1");
        t.run();
        System.out.println(t.getName());
    }
}