package com.collections;

import java.util.EnumSet;
import java.util.Iterator;

enum days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THUSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
};

class JavaEnumSet {
    public static void main(String[] args) {
        EnumSet<days> set = EnumSet.allOf(days.class);
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}