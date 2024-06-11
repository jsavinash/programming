package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

//LinkedHashSet
//have unique key value.
//have null value.
//Save ordered data.
//LinkedHashSet E--> HashSet E--> AbstractSet I--> Set E--> Collection E--> Iterable
class JavaLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
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