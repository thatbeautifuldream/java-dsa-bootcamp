package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        //Input a number and print all the factors of that number (use loops).
        Scanner in = new Scanner(System.in);
        //Input number from user
        System.out.println("Please enter number:");
        int num = in.nextInt();
        //for (initial i = 1;i is lessthanEqualto number; i ++)
        for ( int i = 1 ; i <= num ; i++){
          /*  that means
            12 / 4 = 3
            12 / 3 = 4*/
            if(num % i == 0)
            {
                System.out.println(" " +i);
            }

        }



    }
}
