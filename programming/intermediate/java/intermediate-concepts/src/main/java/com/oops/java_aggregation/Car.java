package com.oops.java_aggregation;

import java.util.ArrayList;
import java.util.Iterator;

class Car {
    String name;
    ArrayList<Wheel> wheels = new ArrayList();

    Car(String name) {
        this.name = name;
    }

    void addWheel(Wheel wheel) {
        this.wheels.add(wheel);
    }

    void showWheelDetails() {
        Iterator<Wheel> itr = this.wheels.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().name);
        }
    }
}