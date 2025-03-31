package com.data_structures_2.array;

import java.lang.Iterable;
import java.util.Iterator;

public class Array<T> implements Iterable<T> {
    T[] values;  // this contains the actual elements of the array
    int capacity;  // this contains the actual elements of the array
    int currentIndex = 0;
    int incrementCapacity = 10;  // this contains the actual elements of the array

    public Array() {
    }

    public Array(T[] values) {
        this.values = values;
        this.currentIndex = values.length - 1;
    }

    public Array(int capacity) {
        this.capacity = capacity;
        this.values = (T[]) new Object[capacity];
        this.currentIndex = 0;
    }

    // Return the value at a given index
    public T get(int index) {
        try {
            return values[index];
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
    }

    // Set the value at a given index
    public void set(int index, T value) throws IndexOutOfBoundsException {
        try {
            values[index] = value;
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
    }

    // Set the value at a given index
    public void add(T value) {
        int currentIdx = 0;
        if (this.currentIndex != 0) {
            currentIdx = this.currentIndex++;
        }
        if (currentIdx >= values.length || currentIdx == 0) {
            T[] previousValue = this.values;
            this.values = (T[]) new Object[this.incrementCapacity];
            for (int i = 0; i < previousValue.length; i++) {
                this.values[i] = previousValue[i];
            }
        }
        this.values[currentIdx] = value;
        this.currentIndex++;
    }

    // Return the length of the array
    public int length() {
        return values.length;
    }


    public Iterator<T> iterator() {
        return new ArrayIterator(values);
    }

    // class might be used.
    public static void main(String[] args) {
        // create an array of strings

        // create a new array to hold these strings
        Array<String> array = new Array<String>(10);

        // get and print the first values (prints "Hello")

        // set the second value
        array.add("Demo");
        array.add("Demo2");
        System.out.println(array.length());

        Iterator itr = array.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
