package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;


public class Q24 {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        int sum = 0;
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        do{
            num = in.nextInt();
            sum = sum + num;
        }
        while (num != 0);
        System.out.println("Sum = " + sum);
    }
}

