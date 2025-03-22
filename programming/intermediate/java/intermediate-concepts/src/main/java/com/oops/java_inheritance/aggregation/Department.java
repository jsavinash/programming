package com.oops.java_inheritance.aggregation;
import java.util.ArrayList;

class Department {
  String name;
  ArrayList<Student> students = new ArrayList<Student>();

  Department(String name) {
    this.name = name;
  }

  void addStudent(Student student) {
    students.add(student);
  }

  void showDepartmentDetails() {
    System.out.println(this.name);
    System.out.println("Student Names :-");
    this.students.forEach((student) -> {
      System.out.println(student.name);
    });
  }

  public static void main(String[] args) {
    Department department = new Department("Library");
    department.addStudent(new Student("Avinash"));
    department.addStudent(new Student("Takshvi"));
    department.showDepartmentDetails();
  }
}