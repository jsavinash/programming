package com.algorithms.dynamic_programming.grid_dp.minimum_path_sum;

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

    int computeMinimumPathSumInGridTriangle(int row, int col, int[][] grid) {
        if (row == grid.length - 1) {
            return grid[grid.length - 1][col];
        }  else {
            int down = computeMinimumPathSumInGridTriangle(row + 1, col, grid);
            int diagonal = computeMinimumPathSumInGridTriangle(row + 1, col + 1, grid);
            return Math.min(down, diagonal) + grid[row][col];
        }
    }

    public static void main(String args[]) {
        MinimumPathSum mps = new MinimumPathSum();
        int[][] grid = {{5, 9, 6}, {11, 5, 2}};
        int[][] gridTriangle = {{2}, {3, 7}, {8, 5, 6}, {6, 1, 9, 3}};
        System.out.println(mps.computeMinimumPathSumInGrid(grid.length - 1, grid[0].length - 1, grid));
        System.out.println(mps.computeMinimumPathSumInGridTriangle(0, 0, gridTriangle));
    }
}
