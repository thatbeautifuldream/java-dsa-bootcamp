// Problem Link : https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] inc = {-1, 1};
        int r = 0;
        int c = 0;
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int[] rc : indices) {
            r += inc[rows[rc[0]] ^= 1];
            c += inc[cols[rc[1]] ^= 1];
        }
        return r * n + c * m - r * c * 2;
    }
}