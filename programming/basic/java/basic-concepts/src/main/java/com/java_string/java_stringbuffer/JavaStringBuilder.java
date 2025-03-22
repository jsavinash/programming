package com.java_string.java_stringbuffer;

class JavaStringBuilder {
    void stringBuilderFunc() {
        StringBuilder sb = new StringBuilder(); //Mutable, not a thread safe. faster then String Buffer.
        sb.append("Avinash");
        sb.append("Nishad");
        sb.replace(1, 3, "JAVA");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        JavaStringBuilder jsd = new JavaStringBuilder();
        jsd.stringBuilderFunc();
    }
}