package com.oops.misc;

class JavaCallByRefrance {
    Integer count = 50;

    void changeCount(JavaCallByRefrance op) {
        op.count = op.count + 100;
    }


    public static void main(String[] args) {
        JavaCallByRefrance op = new JavaCallByRefrance();
        op.changeCount(op);
        System.out.println(op.count);
    }
}