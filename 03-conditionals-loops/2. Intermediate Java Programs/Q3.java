import java.util.*;
public class Q3 {
    public static void main(String[] args){
        // Calculate Average Of N Numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n = in.nextInt();
        int sum = 0;
        System.out.println("Enter the "+n+" elements respectively :");
        for(int i = 0; i < n; i++){
            int num = in.nextInt();
            sum += num;
        }
        double average = (double)sum / n;
        System.out.println(average);
        in.close();
    }
}

// sum =n*(n+1)/2
// so average is n+1/2

package com.Intermediate_Java_Programs;
import java.util.Scanner;

public class kk_3_Aver_N_nos {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        float average = (float)(n+1)/2;

        System.out.println("Average is: " + average);
    }
}
