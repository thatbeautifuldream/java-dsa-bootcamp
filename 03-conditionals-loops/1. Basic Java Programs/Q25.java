package _03_Conditional_Loops.Basic_java;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter numbers: " );
        int num = 0;
        int large = 0;
        int cont = 0;
        int small = 0;
        do{

            num = in.nextInt();
            small = in.nextInt();
            large = in.nextInt();
            if (cont == 0)
                small = large = num;

            if(small<large){
               large = num;
            }
        }
        while(num != 0);
        System.out.println("Lagest no is: " +large);
    }
}
