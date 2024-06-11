package com.oops.java_object;

class School {
  String name;

  School(String name) {
    this.name = name;
  }
  void showSchoolName() {
    System.out.println(name);
  }

  public static void main(String[] args) {
    School school = new School("Amrut Higher Secondary School");
    school.showSchoolName();
  }
}