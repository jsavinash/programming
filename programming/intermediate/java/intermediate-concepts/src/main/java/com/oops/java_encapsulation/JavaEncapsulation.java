package com.oops.java_encapsulation;

class JavaEncapsulation {
    private String name = "";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        JavaEncapsulation je = new JavaEncapsulation();
        je.setName("Avinash");
        System.out.println(je.getName());
    }
}