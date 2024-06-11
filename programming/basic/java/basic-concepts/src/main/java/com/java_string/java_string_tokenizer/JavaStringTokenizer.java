package com.java_string.java_string_tokenizer;

import java.util.StringTokenizer;

class JavaStringTokenizer {
    String name = "Hello world This is string";

    void createStringTokenizer() {
        StringTokenizer st = new StringTokenizer(this.name);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    public static void main(String[] args) {
        JavaStringTokenizer jst = new JavaStringTokenizer();
        jst.createStringTokenizer();
    }
}