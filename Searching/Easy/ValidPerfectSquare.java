// Problem Link : https://leetcode.com/problems/valid-perfect-square/

class Solution {
    public boolean isPerfectSquare(int num) {
        long left=0;
        long right=num; 
        while(left<=right)
        {   
            long mid= left+(right-left)/2;
            if(mid*mid==num)
                return true;
            if(num>mid*mid)
                left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}