package com.data_structures.array;

class DynamicArray {
    int[] arr;
    int capacity;
    int currentCount;

    DynamicArray(int capacity) {
        this.currentCount = 0;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    void insert(int data) {
        if (currentCount == arr.length) {
            capacity = 2 * capacity;
            int[] newArr = new int[2 * capacity];
            for (int i = 0; i < currentCount; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[currentCount] = data;
        currentCount++;
    }

    void print() {
        for (int i = 0; i < capacity; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(5);
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.insert(6);
        array.print();
    }
}