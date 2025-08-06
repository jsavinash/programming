package com.algorithms.dynamic_programming.n_dimension_array.ninja_training;

public class NinjaTraining {
    int computeNinjaTraining(int idx, int perviousJobIdx, int[][] arr) {
        if (idx == -1) {
            return 0;
        }
        int maxMarit = Integer.MIN_VALUE;
        int currentJobIndex = -3;
        for (int i = 0; i < arr[idx].length; i++) {
            if (perviousJobIdx == i) {
                continue;
            }
            int max = Math.max(arr[idx][i], maxMarit);
            if (max > maxMarit) {
                maxMarit = arr[idx][i];
                currentJobIndex = i;
            }

        }
        return maxMarit + computeNinjaTraining(idx - 1, currentJobIndex, arr);
    }

    public static void main(String args[]) {
        int[][] arr = {{2, 1, 3}, {3, 4, 6}, {10, 1, 6}, {8, 3, 7}};
        NinjaTraining nj = new NinjaTraining();
        System.out.println(nj.computeNinjaTraining(arr.length - 1, -3, arr));

    }
}
