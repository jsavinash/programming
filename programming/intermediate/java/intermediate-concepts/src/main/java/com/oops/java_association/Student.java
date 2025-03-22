package com.oops.java_association;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    ArrayList<Course> courses = new ArrayList();

    void addCourses(Course course) {
        this.courses.add(course);
    }

    void showAllCourses() {
        Iterator<Course> itr = this.courses.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().name);
        }
    }
}
