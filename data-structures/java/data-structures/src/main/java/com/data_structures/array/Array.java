package com.data_structures.array;

class Array {
    int[] arr;
    int capacity;
    int currentCount;

    Array(int capacity) {
        this.currentCount = 0;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    void insert(int data) throws ArrayIndexOutOfBoundsException {
        if (currentCount == arr.length)
            throw new ArrayIndexOutOfBoundsException("Incremented index can't be inserted");

        arr[currentCount] = data;
        currentCount++;
    }

    void print() {
        for (int i = 0; i < capacity; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        try {
            Array array = new Array(5);
            array.insert(1);
            array.insert(2);
            array.insert(3);
            array.insert(4);
            array.insert(5);
            array.print();
            array.insert(6);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}