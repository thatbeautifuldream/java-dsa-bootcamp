package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Please enter numbers: " );
//         int num = 0;
//         int large = 0;
//         int cont = 0;
//         int small = 0;
//         do{

//             num = in.nextInt();
//             small = in.nextInt();
//             large = in.nextInt();
//             if (cont == 0)
//                 small = large = num;

//             if(small<large){
//                large = num;
//             }
//         }
//         while(num != 0);
//         System.out.println("Lagest no is: " +large);
        
        // to find the largest number among all the number till user input 0;
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter numbers: " );
        int input = 0;
        int large = 0;
        int counter = 0;
        int small = 0;
        while ((input = sc.nextInt()) != 0) {

            if (counter == 0)
                small = large = input;

            counter++;

            if (input > large)
                large = input;

            if (input < small)
                small = input;
        }
         System.out.println(large);
    }
}


// Better approach
package com.company;

import java.util.Scanner;

public class kk_25_Input_till_0_maxm {
    public static void main(String[] args) {
        int n,max=0,temp; //considering + nos
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        do {
            n = sc.nextInt();
            temp = n;
            if(temp>max)
            {
                max = temp;
            }
        }
        while(n!=0);
        System.out.println(max);
    }
}
