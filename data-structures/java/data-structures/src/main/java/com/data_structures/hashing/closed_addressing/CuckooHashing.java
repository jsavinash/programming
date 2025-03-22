package com.data_structures.hashing.closed_addressing;

class CuckooHashing {
    int[][] arr;
    int capacity;

    CuckooHashing(int capacity) {
        this.capacity = capacity;
        this.arr = new int[2][capacity];
    }

    public int mod(int data) {
        return data % capacity;
    }

    public int mod5(int data) {
        return (data / 11) % 11;
    }

    boolean rowZeroOccupied(int key) {
        return arr[0][key] != 0;
    }

    int rowZeroData(int key) {
        return arr[0][key];
    }

    void insertRowZero(int key, int data) {
        arr[0][key] = data;
    }

    void insertRowOne(int key, int data) {
        arr[1][key] = data;
    }

    boolean rowTwoOccupied(int key) {
        return arr[1][key] != 0;
    }

    void insert(int data) throws Exception {
        int key = mod(data);
        if (!rowZeroOccupied(key)) {
            insertRowZero(key, data);
        } else {
            int storedData = rowZeroData(key);
            insertRowZero(key, data);
            int newKey = mod5(data);
            if (!rowTwoOccupied(key)) {
                insertRowOne(newKey, storedData);
            } else {
                throw new Exception("Space already occupied :: [1]" + "[" + newKey + "]");
            }
        }
    }

    void hastable() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < capacity; j++) {
                System.out.print(arr[i][j] + "=>");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        try {
            CuckooHashing cuckooHashing = new CuckooHashing(2);
            cuckooHashing.insert(4);
            cuckooHashing.insert(3);
            cuckooHashing.insert(8);
            cuckooHashing.insert(5);
            cuckooHashing.hastable();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}