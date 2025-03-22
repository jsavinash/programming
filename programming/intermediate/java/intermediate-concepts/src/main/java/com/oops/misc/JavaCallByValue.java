package com.oops.misc;

class JavaCallByValue {
    Integer count = 50;

    void changeCount(Integer count) {
        count = count + 100;
    }


    public static void main(String[] args) {
        JavaCallByValue jcv = new JavaCallByValue();
        jcv.changeCount(100);
        System.out.println(jcv.count);
    }
}