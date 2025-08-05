package com.algorithms.dynamic_programming.grid_dp;

public class FindUniqueWaysInGrid {
    int computeUniqueToPointInGrid(int row, int col) {
        if (row == 0 && col == 0) {
            return 1;
        } else if (row < 0 || col < 0) {
            return 0;
        } else {
            int up = computeUniqueToPointInGrid(row - 1, col);
            int left = computeUniqueToPointInGrid(row, col - 1);
            return up + left;
        }
    }

    int computeUniqueToPointInGridWithBlocked(int row, int col, int[][] grid) {
        if (row == 0 && col == 0) {
            return 1;
        } else if (row < 0 || col < 0) {
            return 0;
        } else if (grid[row][col] == -1) {
            return 0;
        } else {
            int up = computeUniqueToPointInGridWithBlocked(row - 1, col, grid);
            int left = computeUniqueToPointInGridWithBlocked(row, col - 1, grid);
            return up + left;
        }
    }

    public static void main(String args[]) {
        FindUniqueWaysInGrid fuwig = new FindUniqueWaysInGrid();
        int[][] grid = {{0, 0, 0}, {0, -1, 0}, {0, 0, 0}};
        System.out.println(fuwig.computeUniqueToPointInGrid(1, 1));
        System.out.println(fuwig.computeUniqueToPointInGridWithBlocked(grid[0].length - 1, grid.length - 1, grid));
    }
}
