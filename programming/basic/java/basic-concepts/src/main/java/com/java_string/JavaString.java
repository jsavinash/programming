package com.java_string;

//String implements Serializable, Comparable, CharSequence

class JavaString {
    void charArrToString() {
        char[] charArr = {'a', 'v', 'i'};
        String str = new String(charArr);
        System.out.println(str);
    }

    void stringLiterals() {
        String str = "avi";
        System.out.println(str);
    }

    void stringAreImmutable() {
        String str = "avinash";
        // str.concat("nishad"); //string pool constant pointer not assigned.
        str = str.concat("nishad"); //string pool constant pointer assigned.
        System.out.println(str);
    }

    public static void main(String[] args) {
        JavaString js = new JavaString();
        js.charArrToString();
        js.stringLiterals();
        js.stringAreImmutable();
    }
}