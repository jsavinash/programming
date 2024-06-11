package com.oops.java_polymorphism.java_downcasting;


class JavaDownCastingDerived extends JavaDownCastingBase {
    void showClassName() {
        System.out.println("JavaUpcastingDerived called");
    }

    static void showDownCasting(JavaDownCastingBase jdcb) {
        JavaDownCastingDerived javaUpcastingBase = (JavaDownCastingDerived) jdcb;
        javaUpcastingBase.showClassName();

    }

    public static void main(String[] args) {
        JavaDownCastingBase a = new JavaDownCastingDerived();
        JavaDownCastingDerived.showDownCasting(a);
    }
}