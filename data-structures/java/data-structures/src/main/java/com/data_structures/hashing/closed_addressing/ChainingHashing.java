package com.data_structures.hashing.closed_addressing;

import java.util.Iterator;
import java.util.LinkedList;

class ChainingHashing {
    LinkedList<Integer>[] slots;
    int capacity;
    int currentSize;

    ChainingHashing(int capacity) {
        this.capacity = capacity;
        slots = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            slots[i] = new LinkedList<Integer>();
        }
    }

    public int mod(int data) {
        return data % capacity;
    }

    void insert(int data) {
        int key = mod(data);
        slots[key].add(data);
        currentSize++;
    }

    void displayHashtable() {
        for (int i = 0; i < capacity; i++) {
            Iterator iterator = slots[i].iterator();
            System.out.print("Index :: " + i + " :: ");
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " => ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        ChainingHashing chainingHashing = new ChainingHashing(5);
        chainingHashing.insert(1);
        chainingHashing.insert(4);
        chainingHashing.insert(7);
        chainingHashing.insert(9);
        chainingHashing.insert(2);
        chainingHashing.insert(3);
        chainingHashing.insert(5);
        chainingHashing.displayHashtable();
    }
}