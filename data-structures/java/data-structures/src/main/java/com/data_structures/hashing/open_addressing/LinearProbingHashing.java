package com.data_structures.hashing.open_addressing;


class LinearProbingHashing {
    private final int[] slots;
    int currentSize = 0;
    int capacity = 0;

    LinearProbingHashing(int capacity) {
        slots = new int[capacity];
        this.capacity = capacity;
    }

    public int linearHashingFunction(int data) {
        int key = data % capacity;
        if (key < 0) {
            key += capacity;
        }
        return key;
    }

    public boolean slotEmpty(int hash) {
        return slots[hash] == 0;
    }

    public void insertHash(int data) throws ArrayIndexOutOfBoundsException {
        int hash = linearHashingFunction(data);
        boolean isSlotEmpty = slotEmpty(hash);
        if (currentSize >= capacity) {
            throw new ArrayIndexOutOfBoundsException("Slot capacity dosen't allow currentIndex :- " + hash);
        }
        if (isSlotEmpty) {
            slots[hash] = data;
            currentSize++;
        } else {
            insertHash(hash + 1);
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
            LinearProbingHashing linearProbingHashing = new LinearProbingHashing(5);
            linearProbingHashing.insertHash(9);
            linearProbingHashing.insertHash(5);
            linearProbingHashing.insertHash(7);
            linearProbingHashing.insertHash(1);
            linearProbingHashing.insertHash(2);
            linearProbingHashing.displayHashtable();
            linearProbingHashing.insertHash(4);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}