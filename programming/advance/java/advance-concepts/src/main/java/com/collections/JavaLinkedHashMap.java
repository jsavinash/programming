package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

//key and value.
//one null key and multiple null value.
//maintain order.
class JavaLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("name", "Avinash");
        map.put("age", "21");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}