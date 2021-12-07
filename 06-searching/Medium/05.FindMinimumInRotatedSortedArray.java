//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        if(pivot == -1)
            return nums[0];
        else
            return nums[pivot+1];
    }
    int findPivot(int[] nums){
        int s = 0,e=nums.length-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(mid < e && nums[mid] > nums[mid+1])
                return mid;
            if(s < mid && nums[mid - 1] > nums[mid])
                return mid-1;
            
            if(nums[mid] > nums[s])
                s = mid;
            else
                e = mid - 1;
        }
        return -1;
    }
}
