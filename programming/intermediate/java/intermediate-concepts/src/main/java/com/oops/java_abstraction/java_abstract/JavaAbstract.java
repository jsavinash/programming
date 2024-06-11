package com.oops.java_abstraction.java_abstract;

abstract class JavaAbstract {
    String name = "Demo";

    JavaAbstract() {
        System.out.println("JavaAbstract Constructor called");
    }

    abstract void printName();

    void func() {
        System.out.println("Normal Function called");
    }

    final void finalFun() {
        System.out.println("Final Function called");
    }

    static void staticFun() {
        System.out.println("Static Function called");
    }
}