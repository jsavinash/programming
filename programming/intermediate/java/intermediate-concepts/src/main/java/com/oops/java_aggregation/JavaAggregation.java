package com.oops.java_aggregation;

//Aggregation :- Car can exist with or without wheel.
//has-a relationship
public class JavaAggregation {
    public static void main(String[] args) {
        Car car = new Car("Tata");
        car.addWheel(new Wheel("MRF Tyre"));
        car.addWheel(new Wheel("JK Tyre"));
        car.addWheel(new Wheel("March Tyre"));
        car.addWheel(new Wheel("Apollo Tyre"));
        car.showWheelDetails();
    }
}
