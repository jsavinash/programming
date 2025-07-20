package com.algorithms.dynamic_programming.frog_jump;

public class FrogJump {
    double minimumEnergyRequired(int[] staircase, int idx) {
        if (idx == 0) {
            return 0;
        } else {
            double oneStepBackFromEnd = minimumEnergyRequired(staircase, idx - 1) + Math.abs(staircase[idx] - staircase[idx - 1]);
            double twoStepBackFromEnd = Double.POSITIVE_INFINITY;
            if (idx > 1)
                twoStepBackFromEnd = minimumEnergyRequired(staircase, idx - 2) + Math.abs(staircase[idx] - staircase[idx - 2]);
            return Math.min(oneStepBackFromEnd, twoStepBackFromEnd);
        }
    }

    double maximumEnergyRequired(int[] staircase, int idx) {
        if (idx == 0) {
            return 0;
        } else {
            double oneStepBackFromEnd = maximumEnergyRequired(staircase, idx - 1) + Math.abs(staircase[idx] - staircase[idx - 1]);
            double twoStepBackFromEnd = Double.NEGATIVE_INFINITY;
            if (idx > 1)
                twoStepBackFromEnd = maximumEnergyRequired(staircase, idx - 2) + Math.abs(staircase[idx] - staircase[idx - 2]);
            return Math.max(oneStepBackFromEnd, twoStepBackFromEnd);
        }
    }

    public static void main(String args[]) {
        int[] staircase = {10, 20, 30, 10};
        FrogJump fj = new FrogJump();
        System.out.println(fj.minimumEnergyRequired(staircase, staircase.length - 1));
        System.out.println(fj.maximumEnergyRequired(staircase, staircase.length - 1));
    }
}
