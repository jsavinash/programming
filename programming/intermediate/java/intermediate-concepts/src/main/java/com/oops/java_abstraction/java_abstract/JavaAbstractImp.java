package com.oops.java_abstraction.java_abstract;

class JavaAstractImp extends JavaAbstract {
    void printName() {
        System.out.println("Abstract Method implementation");
    }

    public static void main(String[] args) {
        JavaAstractImp a = new JavaAstractImp();
        JavaAstractImp.staticFun();
        System.out.println(a.name);
        a.printName();
        a.finalFun();
        a.func();
    }
}