package com.vidit;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int max= Math.max(num1, num2);


            for (int i = max; i >=1; i--) {
                if (num1%i==0 && num2%i==0){
                    System.out.println("HCF is " + i);
                    break;
                }
            }



    }
}
