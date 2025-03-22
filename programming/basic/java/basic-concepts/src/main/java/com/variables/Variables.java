package com.variables;

public class Variables {
    // Instance variable declaration
    String instanceVariable = "Instance variable";

    // Static variable declaration
    static String staticVariable = "Static variable";
    // Global variable declaration
    static String globalVariable = "Global variable";

    String showLocalVariable() {
        // Local variable declaration
        String middleName = "Local variable";
        return middleName;
    }

    public static void main(String args[]) {
        Variables v = new Variables();
        System.out.println(Variables.globalVariable);
        System.out.println(v.instanceVariable);
        System.out.println(v.showLocalVariable());
        System.out.println(Variables.staticVariable);
    }
}