package com.thread;

class JavaThreadByThreadClass extends Thread {
    public void run() {
        System.out.println("Thread is running..............");
    }

    public static void main(String args[]) {
        JavaThreadByThreadClass t = new JavaThreadByThreadClass();
        t.setName("thread_1");
        t.start();
        System.out.println(t.getName());
    }
}