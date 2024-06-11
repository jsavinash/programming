package com.oops.java_polymorphism.java_upcasting;

//upcasting and downcasting are an example of dynamic binding.
class JavaUpcastingDerived extends JavaUpcastingBase {
    void showClassName() {
        System.out.println("JavaUpcastingDerived called");
    }

    public static void main(String[] args) {
        JavaUpcastingBase javaUpcastingBase  = new JavaUpcastingDerived();
        javaUpcastingBase.showClassName();
    }
}