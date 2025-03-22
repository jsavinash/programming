package com.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//LinkedList
//can have null
//LinkedList E--> AbstractSequentialList I--> List E--> Collection E--> Iterator.
//LinkedList I--> Dequeue E--> Queue E--> Collection E--> Iterator.
class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<String>();
        students.add("Nishad");
        students.add("Jyoti");
        students.add("Avinash");
        students.set(1, "Takshvi");
        Iterator itr = students.iterator();//getting the Iterator
        itr.forEachRemaining((str) -> {
            System.out.println(str);
        });
//
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
        Collections.sort(students);
//        for (String student : students) {
//            System.out.println(student);
//        }
        ListIterator<String> list = students.listIterator(students.size());
        while (list.hasPrevious()) {
            System.out.println(list.previous());
        }

    }
}