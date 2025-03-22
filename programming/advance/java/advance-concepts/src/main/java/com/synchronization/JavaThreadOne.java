package com.synchronization;

class JavaThreadOne extends Thread {
    ResourceInterface resource;

    JavaThreadOne(ResourceInterface resource) {
        this.resource = resource;
    }

    public void run() {
        this.resource.printNumbers(5);
    }
}