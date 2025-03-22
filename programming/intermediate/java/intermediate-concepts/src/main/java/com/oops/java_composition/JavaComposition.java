package com.oops.java_composition;

//Composition :- Heart can't exit without body
public class JavaComposition {
    public static void main(String[] args) {
        HumanBody hbObject = new HumanBody(new Heart());
        hbObject.showHeartStatus();
    }
}
