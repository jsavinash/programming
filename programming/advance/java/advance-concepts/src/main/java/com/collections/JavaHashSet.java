package com.collections;

import java.util.HashSet;
import java.util.Iterator;

//HashSet
//have unique key value.
//have null value.
//Can't save ordered data.
//HashSet E--> AbstractSet I--> Set E--> Collection E--> Iterable
class JavaHashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("avinash");
        set.add("nishad");
        set.add("takshvi");
        set.add("jyoti");
        System.out.println("contains :" + set.contains("jyoti"));
        System.out.println("size :" + set.size());
        set.remove("jyoti");
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}