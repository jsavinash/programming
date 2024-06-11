package com.java_this;

public class JavaThis {
    Integer counter = 0;

    JavaThis() {
        System.out.println("Constructor without params");
    }

    JavaThis(Integer counter) {
        this();
        this.counter = counter; // this can be used to refer current class instance.
        System.out.println("Parametrized Constructor");
    }

    void showCounterFromThis() {
        returnCounter().showCounter(); // this can be used to invoke current class instance.
    }

    JavaThis returnCounter() {
        return this;
    }

    void showCounter() {
        System.out.println(this.counter);
    }

    public static void main(String[] args) {
        JavaThis javaThis = new JavaThis(1);
        javaThis.showCounterFromThis();
    }
}
