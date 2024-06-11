package com.oops.java_polymorphism.java_instanceof;

class JavaInstanceOf {
    public static void main(String[] args) {
        JavaInstanceOf jno = new JavaInstanceOf();
        if(jno instanceof JavaInstanceOf) {
            System.out.println("jno is an instance of JavaInstanceOf");
        }
    }
}