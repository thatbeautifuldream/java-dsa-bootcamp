// Problem Link : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++ ){
            ans = ans + bs(grid[i]);
        }
        return ans;
    }
    public int bs(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        while (start <= end){
            int mid = start + (end-start) / 2;
            if(arr[mid] >= 0){
                start = mid + 1;
            }
            else{
                count = count + end - mid + 1;
                end = mid - 1;
            }
            
        }
        return count;
    }
}
