// Problem Link : https://leetcode.com/problems/single-number/
// XOR Operations : https://www.geeksforgeeks.org/xor-operation-in-an-array/
// a^0 = a
// a^a = 0
// a^b^a = b
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}