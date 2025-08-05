package com.algorithms.dynamic_programming.longest_increasing_subsequence;

public class LongestIncreasingSubsequence {
    int computeLongestIncreasingSubsequence(int idx, int prevIdx, int arr[], int n) {
        if (idx == n) {
            return 0;
        }
        int len = 0 + computeLongestIncreasingSubsequence(idx + 1, prevIdx, arr, n);
        if (prevIdx == -1 || (arr[idx] > arr[prevIdx])) {
            len = Math.max(len, 1 + computeLongestIncreasingSubsequence(idx + 1, idx, arr, n));
        }
        return len;
    }

    public static void main(String args[]) {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] arr = {2, 5, 1};
        System.out.println(lis.computeLongestIncreasingSubsequence(0, -1, arr, arr.length));
    }
}
