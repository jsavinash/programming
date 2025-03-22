package com.oops.java_polymorphism.method_overloading;

public class JavaMethodOverloading {

    Integer add(int a, int b) {
        return a + b;
    }

    Integer add(int a, int b, int c) {
        return a + b + c;
    }

    String add(String name) {
        return name;
    }

    public static void main(String[] args) {
        JavaMethodOverloading javaMethodOverloading = new JavaMethodOverloading();
        System.out.println(javaMethodOverloading.add(1, 1));
        System.out.println(javaMethodOverloading.add(1, 1, 1));
        System.out.println(javaMethodOverloading.add("Avinash"));

    }
}
