Problem Link : https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) {
            return false;
        }
        while(n>1 && (n&1)==0) {
            n>>=1; // n right shifts
        }
        return n==1?true:false;
    }
}