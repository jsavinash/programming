package com.java_array;

class JavaArray {

    void makeOneArray() {
        // int[] array = new int[5];
        // int []array = new int[5];
        int array[] = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = i;
        }
        for (int j : array) {
            System.out.println(j);
        }
    }

    void makeOneArrayWithSequence() {
        //  int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //  int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int k : arr) {
            System.out.println(k);
        }
    }

    void makeTwoArray() {
        // int[][] arr = {{1, 1}, {1, 2}, {1, 3}};
        // int [][]arr = {{1, 1}, {1, 2}, {1, 3}};
        //int arr[][] = {{1, 1}, {1, 2}, {1, 3}};
        int[] arr[] = {{1, 1}, {1, 2}, {1, 3}};
        for (int k = 0; k < arr.length; k++) {
            for (int m = 0; m < arr[k].length; m++) {
                System.out.println(arr[k][m]);
            }
        }
    }

    void makeOneArrayWithParams(int[] arr) {
        for (int k : arr) {
            System.out.println(k);
        }
    }

    void makeTwoArrayWithParams(int[] arr[]) {
        for (int k = 0; k < arr.length; k++) {
            for (int m = 0; m < arr[k].length; m++) {
                System.out.println(arr[k][m]);
            }
        }
    }

    public static void main(String[] args) {
        JavaArray je = new JavaArray();
        je.makeOneArray();
        je.makeOneArrayWithSequence();
        je.makeOneArrayWithParams(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        je.makeTwoArray();
        je.makeTwoArrayWithParams(new int[][]{{1, 1}, {1, 2}, {1, 3}});
    }
}