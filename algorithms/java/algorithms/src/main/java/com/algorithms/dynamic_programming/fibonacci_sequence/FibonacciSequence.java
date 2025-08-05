package com.algorithms.dynamic_programming.fibonacci_sequence;

import java.util.Arrays;

//0 1 1 2 3 5 8
public class FibonacciSequence {

    //Time Complexity : O(2^n)
    int fibonacciSequence(int n) {
        if (n == 0) { //Exit condition
            return 0;
        } else if (n == 1) { //Exit condition
            return 1;
        }
        return fibonacciSequence(n - 2) + fibonacciSequence(n - 1); // Recursion
    }

    int fibonacciSequenceMemoization(int n, int[] memo) {
        if (n == 0) { //Exit condition
            return 0;
        } else if (n == 1) { //Exit condition
            return 1;
        }

        if (memo[n] != -1) { //Memorised result
            return memo[n];
        }
        memo[n] = fibonacciSequenceMemoization(n - 1, memo) + fibonacciSequenceMemoization(n - 2, memo); // Recursion
        return memo[n];
    }

    //Time Complexity : O(n)
    //Space Complexity : O(n)
    int executeFibonacciSequenceMemoization(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return fibonacciSequenceMemoization(n, memo);
    }

    //Time Complexity : O(n)
    //Space Complexity : O(n)
    int fibonacciSequenceTabulation(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n]; // Recursion
    }

    //Time Complexity : O(1)
    //Space Complexity : O(1)
    int fibonacciSequenceThreePointer(int n) {
        int prePrev, prev, curr;
        prePrev = 0;
        prev = 1;
        curr = 1;
        for (int i = 2; i <= n; i++) {
            curr = prePrev + prev;
            prePrev = prev;
            prev = curr;
        }

        return curr;
    }

    public static void main(String args[]) {
        FibonacciSequence bffs = new FibonacciSequence();
        System.out.println("Brute force Approach :: " + bffs.fibonacciSequence(5));
        System.out.println("Memoization (Top-Down Approach) :: " + bffs.executeFibonacciSequenceMemoization(5));
        System.out.println("Tabulation (Bottom-Up Approach) :: " + bffs.fibonacciSequenceTabulation(5));
        System.out.println("Three pointer Approach :: " + bffs.fibonacciSequenceThreePointer(5));
    }
}
