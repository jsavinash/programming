package com.synchronization;

class JavaThreadOneStatic extends Thread {

    public void run() {
        JavaSynchronizedStaticMethodResource.printNumbers(100);
    }
}