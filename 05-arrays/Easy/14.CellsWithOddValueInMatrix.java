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
        // rows[rc[0]] ^= 1 will flip the value present in rows[rc[0]]
        
        // If value of rows[rc[0]] became 1 then r will be incremented by 1 which is done by inc[1] and
        // if value of rows[rc[0]] became 0 then r will be decremented by 1 which is done by inc[0] 
        // by this we get how many 1's are there in rows[] array in r and cols[] array in c
        
        return r * n + c * m - r * c * 2;
        
        //     same as (n - c) * r + (m - r) * c
        //count of 0 in cols[] * r + count of 0 in rows[] * c
        // r = count of 1 in rows[]
        // c = count of 1 in cols[]
    }
}
