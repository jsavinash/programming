package com.oops.java_class;

public class JavaClass {
    public interface InnerJavaClass { // Inner interface
        String innerName = "Inner name";

        String printInnerName();
    }

    class InnerClass implements InnerJavaClass { // Inner class
        String name = "Name";

        public String printInnerName() {
            return this.name;
        }
    }

    InnerClass obj = new InnerClass();
    String name = "String"; // Fields

    String printName() { // Methods
        return this.name;
    }

    // Initialization block
    {
        this.name = "Avinash";
        System.out.println("Initialization block called");
    }

    JavaClass() { // Constructor
        System.out.println("Constructor called");
    }

    public static void main(String args[]) {
        JavaClass jc = new JavaClass();
    }
}
