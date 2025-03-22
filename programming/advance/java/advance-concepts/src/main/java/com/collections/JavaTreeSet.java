package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet
//Balance binary tree (Red black tree) structure to store data.
//Null value not allowed.
//Data store in ascending order.
//Retrieval time is faster.
//Non synchronized.
//TreeSet I--> NavigableSet E--> AbstractSet E--> Set E--> Collection E--> Iterable
class JavaTreeSet {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("avinash");
        tree.add("takshvi");
        Iterator itr = tree.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}