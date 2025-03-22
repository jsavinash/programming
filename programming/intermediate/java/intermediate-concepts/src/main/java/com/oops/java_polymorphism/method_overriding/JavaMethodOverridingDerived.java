package com.oops.java_polymorphism.method_overriding;

public class JavaMethodOverridingDerived extends JavaMethodOverridingBase {

    Integer addNumber(Integer a, Integer b) {
        return a + b + 10;
    }
    public static void main(String[] args) {
        JavaMethodOverridingDerived jd = new JavaMethodOverridingDerived();
        System.out.println(jd.addNumber(1, 2));
    }
}
