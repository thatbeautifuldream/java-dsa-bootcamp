// Problem Link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
class Solution {
    public int[] twoSum(int[] numbers, int target) {

// time complexity(Worst case) : O(N) and space complexity : O(1)

        int start = 0;
        int end = numbers.length-1;
        while(start <= end) {
            int sum = numbers[start] + numbers[end];
            if(sum == target) {
                break;
            }
            else if(sum < target) {
                start++;
            }
            else {
                end--;
            }
        }
        return new int[]{++start,++end};
    }
}