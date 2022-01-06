//Problem Link : https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums, int target) {

// time complexity(Worst case) : O(logN) and space complexity : O(1)

        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}