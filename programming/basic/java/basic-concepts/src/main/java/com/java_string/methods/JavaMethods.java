package com.java_string.methods;

import java.util.Arrays;

class JavaMethods {
    String str = "";

    JavaMethods(String str) {
        this.str = str;
    }

    void trim() {
        System.out.println(this.str.trim());
    }

    void lowerCase() {
        System.out.println(this.str.toLowerCase());
    }

    void upperCase() {
        System.out.println(this.str.toUpperCase());
    }

    void replace() {
        System.out.println(this.str.replace("World", "Nishad"));
    }

    void concate() {
        this.str = this.str.concat(" Demo");
        System.out.println(this.str);
    }

    String[] split() {
        return this.str.split(" ");
    }

    void join() {
        this.str = this.str.join(" ", this.str, " Car");
        System.out.println(this.str);
    }

    void charAt() {
        System.out.println(this.str.charAt(1));
    }

    void startWith() {
        System.out.println(this.str.startsWith("Hel"));
    }

    void endsWith() {
        System.out.println(this.str.endsWith("ar"));
    }

    void length() {
        System.out.println(this.str.length());
    }


    public static void main(String[] args) {
        JavaMethods jsd = new JavaMethods("Hello World");
        jsd.trim();
        jsd.lowerCase();
        jsd.upperCase();
        jsd.replace();
        jsd.concate();
        Arrays.stream(jsd.split()).forEach((str) -> {
            System.out.println(str);
        });
        jsd.join();
        jsd.charAt();
        jsd.startWith();
        jsd.endsWith();
        jsd.length();

    }
}