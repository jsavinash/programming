package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

//single end
//order could change by priority.
class JavaPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>(4);
        queue.add("avinash");
        queue.add("nishad");
        queue.add("takshvi");
        queue.add("jyoti");
        queue.add("demo_1");
        queue.add("demo_2");

//        queue.poll();
//        queue.poll();
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}