package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

//JavaArrayList
//Dynamic array.
//Can have null value.
//ordered data.
//Processing time is more as it will shift the item on modification.
class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
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