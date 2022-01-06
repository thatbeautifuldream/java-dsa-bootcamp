// Problem Link : https://leetcode.com/problems/powx-n/

class Solution {
    public double myPow(double x, int n) {
        if(n>=0) {
            return posPow(x,n);
        } else {
            return negPow(x,n);
        }
    }
    private double posPow(double x, int n) {
        if(n==0) {
            return 1;
        }
        double y = myPow(x,n/2);
        if(n%2==0) {
            return y*y;
        }
        else {
            return x*y*y;
        }
    }
    private double negPow(double x, int n) {
        if(n==-1) {
            return 1/x;
        }
        double y = myPow(x,n/2);
        if(n%2==0) {
            return y*y;
        }
        else {
            return (1/x)*y*y;
        }
    }
}