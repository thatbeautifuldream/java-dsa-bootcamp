//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res ={-1,-1};
        int n = nums.length-1;
        res[0] = find(nums,target,n,true);
        if(res[0] != -1)
            res[1] = find(nums,target,n,false);
        return res;
    }
    int find(int[] nums, int target, int e, boolean firstElement){
        int s=0,ans=-1;
        while(s <= e){
            int m = e+(s-e)/2;
            if( target > nums[m] )
                s = m+1;
            else if( target < nums[m] )
                e = m-1;
            else{
                ans=m;
                if(firstElement)
                    e=m-1;
                else
                    s=m+1;                    
            }
        }
        return ans;
    }
}
