package com.collections;

import java.util.HashMap;
import java.util.Map;

//key and value.
//one null key and multiple null value.
//maintain no order.
class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name", "Avinash");
        map.put("age", "21");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}