package com.thread;

class JavaThreadJoin extends Thread {
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
        JavaThreadJoin jtj = new JavaThreadJoin();
        JavaThreadJoin jtj2 = new JavaThreadJoin();
        try {
            jtj.join();
            jtj2.start();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
