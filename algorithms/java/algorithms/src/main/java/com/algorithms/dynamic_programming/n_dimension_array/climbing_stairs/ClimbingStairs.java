package com.algorithms.dynamic_programming.n_dimension_array.climbing_stairs;

public class ClimbingStairs {
    // 0 1 2 3
    int countWays(int n) {
        if (n == 0) { //Destination exit condition
            return 1;
        } else if (n < 0) { //Overflow exit condition
            return 0;
        } else {
            //Recursion := Explore all path.
            int oneStepBack = countWays(n - 1);
            int twoStepBack = countWays(n - 2);
            return oneStepBack + twoStepBack;
        }
    }

    public static void main(String args[]) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.countWays(3));
    }
}

