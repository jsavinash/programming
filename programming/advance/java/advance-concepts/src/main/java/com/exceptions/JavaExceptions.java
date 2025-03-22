package com.exceptions;

class JavaExceptions {

    void arithmaticException() {
        try {
            Integer a = 50 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    void nullPointerException() {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    void arrayIndexOutOfBounce() {
        try {
            String[] name = {"a", "v"};
            System.out.println(name[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }


    public static void main(String args[]) {
        JavaExceptions je = new JavaExceptions();
        je.arithmaticException();
        je.nullPointerException();
        je.arrayIndexOutOfBounce();
    }
}