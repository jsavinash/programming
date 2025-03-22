package com.oops.java_association;

public class Country {
    PrimeMinister pm;

    Country(PrimeMinister pm) {
        this.pm = pm;
    }
    void details() {
        System.out.println("One country have one prime minister : [one to one relationship]");
    }
}
