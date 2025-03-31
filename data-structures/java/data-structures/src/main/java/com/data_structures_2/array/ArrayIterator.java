package com.data_structures_2.array;


import java.util.Iterator;
import java.util.NoSuchElementException;

class ArrayIterator<T> implements Iterator<T> {
    T[] values;  // the current element we are looking at
    int current;  // the current element we are looking at

    ArrayIterator(T[] values) {
        this.values = values;
        this.current = 0;
    }

    // return whether or not there are more elements in the array that
    // have not been iterated over.
    public boolean hasNext() {
        if ((this.current < this.values.length)) {
            T nextValueExist = null;
            if (this.values[current] != null) {
                nextValueExist = this.values[current];
            }
            if (nextValueExist != null) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // return the next element of the iteration and move the current
    // index to the element after that.
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.values[current++];
    }
}