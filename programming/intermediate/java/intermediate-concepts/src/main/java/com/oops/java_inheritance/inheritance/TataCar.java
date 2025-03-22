package com.oops.java_inheritance.inheritance;


class TataCar extends Car {
  Integer numberOfModals;
  TataCar(Integer numberOfModals, String name) {
    super(name);
  }
  public static void main(String[] args) {
    TataCar tataCar = new TataCar(10, "TATA");
    tataCar.showCarName();
  }
}