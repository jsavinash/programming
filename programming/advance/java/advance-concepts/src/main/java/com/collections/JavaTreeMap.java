package com.collections;

import java.util.Map;
import java.util.TreeMap;

//red black tree
//ascending order
//unique value
//one null key and multiple null values.
//TreeMap I--> NavigableMap E--> AbstractMap I--> Map
class JavaTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("name", "Avinash");
        map.put("age", "21");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}