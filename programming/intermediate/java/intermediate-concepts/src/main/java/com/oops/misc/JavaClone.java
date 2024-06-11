package com.oops.misc;

class JavaClone implements Cloneable {
    String name = "Avinash";

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            JavaClone jc = new JavaClone();
            JavaClone jc2 = (JavaClone) jc.clone();
            System.out.println(jc2.name);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);

        }
    }
}