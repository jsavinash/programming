package com.collections;

import java.util.Hashtable;
import java.util.Map;

//HashTable E--> Dictionary I--> Map
class JavaHashTable {
    public static void main(String[] args) {
        Hashtable<String, String> hash = new Hashtable<String, String>();
        hash.put("name", "Avinash");
        hash.put("age", "21");
        for (Map.Entry m : hash.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getKey());
        }
    }
}