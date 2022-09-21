// Problem Link : https://leetcode.com/problems/matrix-diagonal-sum/

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int principal = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            principal += mat[i][i];
            secondary += mat[i][n - i - 1];
        }
        return n%2 == 0 ? (principal + secondary) : (principal + secondary - mat[n/2][n/2]);
    }
}
