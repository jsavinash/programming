package com.algorithms.dynamic_programming.n_dimension_array.house_robber;

public class HouseRobber {
    //House Robber
    int maximumNonAdjacentSum(int[] arr, int idx) {
        if (idx == -1) {
            return 0;
        } else if (idx == 0) {
            return arr[idx];
        }
        int pick = arr[idx] + maximumNonAdjacentSum(arr, idx - 2);
        int notPick = 0 + maximumNonAdjacentSum(arr, idx - 1);

        return Math.max(pick, notPick);
    }

    public static void main(String args[]) {
        HouseRobber hr = new HouseRobber();
        int[] arr = {2, 1, 4, 9};
        System.out.println(hr.maximumNonAdjacentSum(arr, arr.length - 1)); //House Robber I
        int[] arr2 = {2, 3, 2};
        int[] arr3 = {1, 2, 3, 1};
        System.out.println(hr.maximumNonAdjacentSum(arr3, arr3.length - 2)); //House Robber II
    }
}
