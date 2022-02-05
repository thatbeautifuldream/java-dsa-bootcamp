package Functions;
import java.util.*;
public class SumOfTwo {
    public static void main(String[] args){
        // Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = sumOfTwo(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        sc.close();
    }
    public static int sumOfTwo(int num1, int num2){
        return (num1 + num2);
    }
}
