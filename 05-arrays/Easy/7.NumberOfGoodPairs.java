class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        int count[] = new int[101]; 
        //since given that 1 <= nums[i] <= 100
        //by default array of integers has 0 value in it
        
        for(int n:nums){
            goodPairs += count[n]++;
        }
        
        //for [1,2,3,1,1,3]
//         (for 1st 1): goodPairs = 0
//                         count[1] = 1
            
//         (for 2nd 1): goodPairs = 0 + count[1] = 1
//                         count[1] = 2
            
//         (for 3rd 1): goodPairs = 1 + count[1] = 3    
//                         count[1] = 3
//         ..same for all pairs
        
        return goodPairs;
    }
}
