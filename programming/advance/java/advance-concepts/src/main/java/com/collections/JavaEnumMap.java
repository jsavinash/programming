package com.collections;

import java.util.EnumMap;
import java.util.Map;

enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THUSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
};

class JavaEnumMap {
    public static void main(String[] args) {
        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
        map.put(Days.MONDAY, "1");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}