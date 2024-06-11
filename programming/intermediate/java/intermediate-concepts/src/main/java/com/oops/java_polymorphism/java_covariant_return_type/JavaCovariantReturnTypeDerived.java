package com.oops.java_polymorphism.java_covariant_return_type;

public class JavaCovariantReturnTypeDerived extends JavaCovariantReturnTypeBase {

    JavaCovariantReturnTypeDerived getInstance() {
        return this;
    }
      public static void main(String[] args) {
        JavaCovariantReturnTypeDerived jc= new JavaCovariantReturnTypeDerived();
        System.out.println(jc.getInstance());
    }
}
