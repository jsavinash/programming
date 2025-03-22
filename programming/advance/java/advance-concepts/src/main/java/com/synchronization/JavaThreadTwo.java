package com.synchronization;

class JavaThreadTwo extends Thread {
    ResourceInterface resource;

    JavaThreadTwo(ResourceInterface resource) {
        this.resource = resource;
    }

    public void run() {
        this.resource.printNumbers(100);
    }
}