// https://leetcode.com/problems/maximum-subarray/
// kadane's algorithm 

class Solution {
    public int maxSubArray(int[] nums) {
        int maxValue = nums[0],sum=0;
        for(int n:nums){
            sum += n;
            if(sum >= maxValue){
                maxValue = sum;
            }
            if(sum < 0){
                sum=0;    
            }
        }
        return maxValue;
    }
}
