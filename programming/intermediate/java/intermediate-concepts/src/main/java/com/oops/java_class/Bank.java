package com.oops.java_class;

class Bank {
  String name;
  String address;

  Bank(String name, String address) {
    this.name = name;
    this.address = address;
  }

  void showBankName() {
    System.out.println(name);
  }

  void showAddressName() {
    System.out.println(address);
  }
}