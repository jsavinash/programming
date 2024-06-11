package com.thread;

class JavaDaemonThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        JavaDaemonThread jdt = new JavaDaemonThread();
        JavaDaemonThread jdt2 = new JavaDaemonThread();
        JavaDaemonThread jdt3 = new JavaDaemonThread();
        jdt.setDaemon(true);
        jdt.start();
        jdt2.start();
        jdt3.start();
    }
}
