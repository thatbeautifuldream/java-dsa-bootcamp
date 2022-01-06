// Problem Link : https://leetcode.com/problems/peak-index-in-a-mountain-array/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {

// time complexity(Worst case) : O(logN) and space complexity : O(1)

        int start = 0, mid = 0, end = arr.length - 1;
        while(start < end) {
            mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}