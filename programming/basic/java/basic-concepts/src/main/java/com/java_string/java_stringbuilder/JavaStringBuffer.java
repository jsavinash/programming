package com.java_string.java_stringbuilder;

class JavaStringBuffer {
    void stringBufferFunc() {
        StringBuilder sb = new StringBuilder(); //Mutable, thread safe. slower then String Builder.
        sb.append("Avinash");
        sb.append("Nishad");
        sb.replace(1, 3, "JAVA");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        JavaStringBuffer jsd = new JavaStringBuffer();
        jsd.stringBufferFunc();
    }
}