//https://www.spoj.com/problems/AGGRCOW/

import java.util.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static boolean chk(long stall[], int cows, int n,long mid){
        int count = 1 ;
        long preVal = stall[0];
        for(int i=1;i<n; i++){
            if(stall[i] - preVal >= mid){
                if(++count == cows)
                    return true;    
                preVal = stall[i];
            }
            
        }
        return false; 
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{

        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for(long j=0;j<t;j++){
            int n =sc.nextInt();
            int cows= sc.nextInt();
            long stall[] = new long[n];
            for (int i = 0; i < n; i++) {
                stall[i] = sc.nextLong();
            }
            Arrays.sort(stall);
            long start = 0;     //minimum value between cows
            long end=stall[n-1]-stall[0]; //maximum value
            long lmid=-1;
            
            while(start<=end){          
                long mid = start + (end-start)/2;
                if(chk(stall,cows,n,mid) == true ){
                    lmid = mid; //final value
                    start = mid + 1;
                }
                else{
                    end = mid -1;   
                }
            }
            System.out.println(lmid);
        }
    }
};
