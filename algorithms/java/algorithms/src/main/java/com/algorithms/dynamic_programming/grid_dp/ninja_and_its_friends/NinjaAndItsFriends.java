package com.algorithms.dynamic_programming.grid_dp.ninja_and_its_friends;

public class NinjaAndItsFriends {
    int countTargetInWays(int f1Row, int f1Col, int f2Row, int f2Col, int[][] arr, int arrRow, int arrCol) {
        if (f1Row > arrRow || f2Row > arrRow) { //Bottom overflow
            return 0;
        } else if (f1Col < 0 || f1Col > arrCol) { //Friend 1 Left and right overflow
            return 0;
        } else if (f2Col < 0 || f2Col > arrCol) { //Friend 2 Left and right overflow
            return 0;
        } else if (f1Row == arrRow || f2Row == arrRow) { //Destination exit condition.
            if (f1Col == f2Col) {
                return arr[arrRow][f1Col];
            } else {
                return arr[arrRow][f1Col] + arr[arrRow][f2Col];
            }
        } else {
            int down = countTargetInWays(f1Row + 1, f1Col, f2Row + 1, f2Col, arr, arrRow, arrCol);
            int leftDown = countTargetInWays(f1Row + 1, f1Col - 1, f2Row + 1, f2Col - 1, arr, arrRow, arrCol);
            int rightDown = countTargetInWays(f1Row + 1, f1Col + 1, f2Row + 1, f2Col + 1, arr, arrRow, arrCol);
            return Math.max(down, Math.max(leftDown, rightDown));
        }
    }

    public static void main(String args[]) {
        NinjaAndItsFriends n = new NinjaAndItsFriends();
        int[][] arr = {{2, 3, 1, 2}, {3, 4, 2, 2}, {5, 6, 3, 5}};
        System.out.println(n.countTargetInWays(0, 0, 0, 3, arr, arr.length - 1, arr[0].length - 1));
    }
}
