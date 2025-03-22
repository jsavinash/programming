package com.synchronization;

class JavaThreadTwoStatic extends Thread {

    public void run() {
        JavaSynchronizedStaticMethodResource.printNumbers(10);
    }
}