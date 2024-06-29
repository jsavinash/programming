package com.data_structures.stack;

class Stack {
    int[] arr;
    int capacity;
    int currentCount;

    Stack(int capacity) {
        this.currentCount = 0;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    void push(int data) {
        arr[currentCount++] = data;
    }

    int pop() {
        currentCount = currentCount - 1;
        int value = arr[currentCount];
        arr[currentCount] = 0;
        return value;
    }

    void print() {
        for (int i = capacity - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        stack.pop();
        System.out.println("**********************");
        stack.print();
    }
}