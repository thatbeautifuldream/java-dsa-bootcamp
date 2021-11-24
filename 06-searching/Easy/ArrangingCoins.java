// Problem Link : https://leetcode.com/problems/arranging-coins/

class Solution {
    public int arrangeCoins(int n) {

// time complexity(Worst case) : O(N)  and space complexity : O(1)

        int count = 0, step = 1;
        while(n > 0) {
            if((n - step) >= 0) {
                count++;
                n -= step;
                step++;
            }
            else {
                break;
            }
        }
        return count;
    }
}