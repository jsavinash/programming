package com.java_static;

public class JavaStatic {
    static Integer counter = 0; // memory allocation done only onces.
    Integer counter2 = 0;

    static {
        counter = 1;
    }

    static class NestedClass {
        static Integer counter3 = 0;

    }

    static void changeCounter() { // static method change static variable.
        counter++; // this can't be used.
    }

    void changeCounter2() { // static variable can't be used in non-static method.
        this.counter2++;
    }

    public static void main(String[] args) {
        JavaStatic javaStatic = new JavaStatic();
        JavaStatic.changeCounter();
        javaStatic.changeCounter2();
        System.out.println(JavaStatic.counter);
        System.out.println(javaStatic.counter2);
        System.out.println(JavaStatic.NestedClass.counter3);
    }

}
