package com.algorithms.dynamic_programming.grid_dp;

public class MinimumPathSum {
    int computeMinimumPathSumInGrid(int row, int col, int[][] grid) {
        if (row == 0 && col == 0) {
            return grid[row][col];
        } else if (row < 0 || col < 0) {
            return Integer.MAX_VALUE;
        } else {
            int up = computeMinimumPathSumInGrid(row - 1, col, grid);
            int left = computeMinimumPathSumInGrid(row, col - 1, grid);
            return Math.min(up, left) + grid[row][col];
        }
    }

    public static void main(String args[]) {
        MinimumPathSum mps = new MinimumPathSum();
        int[][] grid = {{5, 9, 6}, {11, 5, 2}};
        System.out.println(mps.computeMinimumPathSumInGrid(grid.length - 1, grid[0].length - 1, grid));
    }
}
