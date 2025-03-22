package com.oops.java_association;

import java.util.ArrayList;
import java.util.Iterator;

public class Course {
    String name;

    Course(String name) {
        this.name = name;
    }

    ArrayList<Student> students = new ArrayList();

    void addStudents(Student student) {
        this.students.add(student);
    }

    void showAllstudent() {
        Iterator<Student> itr = this.students.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().name);
        }
    }
}
