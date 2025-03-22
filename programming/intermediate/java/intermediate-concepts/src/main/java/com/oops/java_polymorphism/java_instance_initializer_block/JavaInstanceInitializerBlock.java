package com.oops.java_polymorphism.java_instance_initializer_block;

public class JavaInstanceInitializerBlock {
    String name = "";

    {
        name = "Avinash";
    }

    JavaInstanceInitializerBlock() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        JavaInstanceInitializerBlock jd = new JavaInstanceInitializerBlock();
    }
}
