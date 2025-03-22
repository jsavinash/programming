package com.data_structures.hashing.open_addressing;


class DoubleHashing {
    private final int[] slots;
    int currentSize = 0;
    int capacity = 0;

    DoubleHashing(int capacity) {
        slots = new int[capacity];
        this.capacity = capacity;
    }

    public boolean isSlotEmpty(int hash) {
        return slots[hash] == 0;
    }

    public int mod(int data) {
        return data % capacity;
    }

    public int mod5(int data) {
        return data % 5;
    }

    public void doubleHashing(int data) {
        for (int j = 0; j < capacity; j++) {
            int key = (mod(data) + j * mod5(data)) % capacity;
            if (isSlotEmpty(key)) {
                slots[key] = data;
                currentSize++;
                break;
            }
        }
    }

    public void insertHash(int data) throws ArrayIndexOutOfBoundsException {
        int hash = mod5(data);
        if (currentSize >= capacity) {
            throw new ArrayIndexOutOfBoundsException("Slot capacity dosen't allow currentIndex :- " + hash);
        }
        if (isSlotEmpty(hash)) {
            slots[hash] = data;
            currentSize++;
        } else {
            doubleHashing(data);
        }
    }

    public void displayHashtable() {
        for (int i = 0; i < capacity; i++) {
            System.out.println("Index  => " + i + " : " + slots[i]);
        }
    }

    public static void main(String[] args) {
        try {
            DoubleHashing linearProbingHashing = new DoubleHashing(5);
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