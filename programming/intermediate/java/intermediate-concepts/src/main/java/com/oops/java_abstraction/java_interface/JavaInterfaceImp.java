package com.oops.java_abstraction.java_interface;

class JavaInterfaceImp implements JavaInterface {
    public void showName() {
        System.out.println("Avinash");
    }

    public static void main(String[] args) {
        JavaInterfaceImp a = new JavaInterfaceImp();
        a.showName();
    }
}