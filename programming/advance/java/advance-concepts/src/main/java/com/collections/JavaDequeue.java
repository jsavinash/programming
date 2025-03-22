package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//doubled end
//offer -> right to left.
//add -> from left to right.
class JavaDequeue {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<String>(5);
        queue.offer("avinash");
        queue.add("nishad");
        queue.offer("takshvi");
        queue.add("jyoti");
        queue.offer("demo");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}