package com.data_structures.hashing.open_addressing;


class QuadraticProbingHashing {
    private final int[] slots;
    int currentSize = 0;
    int capacity = 0;

    QuadraticProbingHashing(int capacity) {
        slots = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            slots[i] = -1;
        }
        this.capacity = capacity;
    }

    public boolean isSlotEmpty(int hash) {
        return slots[hash] == -1;
    }

    public int linearHashingFunction(int data) {
        return data % capacity;
    }

    public void quadraticHashingFunction(int hash, int data) {
        for (int j = 0; j < capacity; j++) {
            int t = (hash + j * j) % capacity;
            if (isSlotEmpty(t)) {
                slots[t] = data;
                currentSize++;
                break;
            }
        }
    }

    public void insertHash(int data) throws ArrayIndexOutOfBoundsException {
        int hash = linearHashingFunction(data);
        if (currentSize >= capacity) {
            throw new ArrayIndexOutOfBoundsException("Slot capacity doesn't allow currentIndex :- " + hash);
        }
        if (isSlotEmpty(hash)) {
            slots[hash] = data;
            currentSize++;
        } else {
            quadraticHashingFunction(hash, data);
        }
    }

    public void deleteHash(int key) {
        int hash = linearHashingFunction(key);
        slots[hash] = 0;
        currentSize--;
    }

    public void displayHashtable() {
        for (int i = 0; i < capacity; i++) {
            System.out.println("Index  => " + i + " : " + slots[i]);
        }
    }

    public static void main(String[] args) {
        try {
            QuadraticProbingHashing quadraticProbingHashing = new QuadraticProbingHashing(5);
            quadraticProbingHashing.insertHash(9);
            quadraticProbingHashing.insertHash(5);
            quadraticProbingHashing.insertHash(7);
            quadraticProbingHashing.insertHash(1);
            quadraticProbingHashing.insertHash(2);
            quadraticProbingHashing.displayHashtable();
            quadraticProbingHashing.insertHash(4);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}