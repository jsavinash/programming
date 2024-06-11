package com.oops.misc;

class JavaWrapperClass {

    void autoboxing() {
        int num = 2;
        // Integer inum = Integer.valueOf(num); //manual autoboxing;
        Integer inum2 = num; //Autoboxing.
        System.out.println(inum2);
    }

    void unboxing() {
        Integer num = 2;
        // int num2 = num.intValue(); //manual unboxing
        int num3 = num; // automatical unboxing.
        System.out.println(num3);
    }


    public static void main(String[] args) {
        JavaWrapperClass jwc = new JavaWrapperClass();
        jwc.autoboxing();
        jwc.unboxing();
    }
}