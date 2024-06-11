package com.oops.java_polymorphism.java_super;

public class JavaSuperDerived extends JavaSuperBase {
    JavaSuperDerived() {
        super(); // super() can be used to call base constructor.
    }

    void showBaseName() {
        System.out.println(super.name);
    }

    void callBaseMethod() {
        super.showName();
    }

    public static void main(String[] args) {
        JavaSuperDerived jd = new JavaSuperDerived();
        jd.showBaseName();
        jd.callBaseMethod();
    }
}
