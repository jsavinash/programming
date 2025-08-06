package com.algorithms.dynamic_programming.one_dimension_array.frog_jump;

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

    double minimumEnergyRequiredForKthJump(int[] staircase, int idx, int k) {
        if (idx == 0) {
            return 0;
        } else {
            double minJumpEnergy = Double.POSITIVE_INFINITY;
            for (int i = 1; i <= k; i++) {
                if (idx - i >= 0) {
                    double jump = minimumEnergyRequiredForKthJump(staircase, idx - i, k) + Math.abs(staircase[idx] - staircase[idx - i]);
                    minJumpEnergy = Math.min(minJumpEnergy, jump);
                }
            }
            return minJumpEnergy;
        }
    }

    double maximumEnergyRequiredForKthJump(int[] staircase, int idx, int k) {
        if (idx == 0) {
            return 0;
        } else {
            double maxJumpEnergy = Double.NEGATIVE_INFINITY;
            for (int i = 1; i <= k; i++) {
                if (idx - i >= 0) {
                    double jump = maximumEnergyRequiredForKthJump(staircase, idx - i, k) + Math.abs(staircase[idx] - staircase[idx - i]);
                    maxJumpEnergy = Math.max(maxJumpEnergy, jump);
                }
            }
            return maxJumpEnergy;
        }
    }

    public static void main(String args[]) {
        int[] staircase = {10, 20, 30, 10};
        FrogJump fj = new FrogJump();
        System.out.println(fj.minimumEnergyRequired(staircase, staircase.length - 1));
        System.out.println(fj.maximumEnergyRequired(staircase, staircase.length - 1));
        System.out.println(fj.minimumEnergyRequiredForKthJump(staircase, staircase.length - 1, 3));
        System.out.println(fj.maximumEnergyRequiredForKthJump(staircase, staircase.length - 1, 1));
    }
}
