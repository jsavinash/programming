package com.java_string.java_immutable_class;

/*
 * final variable doesn't allow change.
 * final class doesn't allow inheritance
 * no setter so modification not possible.
 */

final class JavaImmutableClass {
    final String name;

    JavaImmutableClass(String name) {
        this.name = name;
    }

    void getName() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        JavaImmutableClass jic = new JavaImmutableClass("Avinash");
        jic.getName();
    }
}