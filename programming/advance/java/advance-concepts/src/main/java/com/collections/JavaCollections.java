package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class JavaCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(45);
        list.add(1);
        list.add(9);
        System.out.println(Collections.addAll(list, 3, 5));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Iterator");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}