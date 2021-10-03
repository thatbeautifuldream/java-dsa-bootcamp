package _03_Conditional_Loops.Intermediate_Java;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter how many number: ");
        int num = in.nextInt();
        System.out.println("Please enter numbers: ");
        for(int i = 1; i<=num; i++){

            int numbers = in.nextInt();
             sum += numbers;

        }
        System.out.println("Sum of " +num+ " is :" + sum);

    }
}

