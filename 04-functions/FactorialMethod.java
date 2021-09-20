package Functions;
import java.util.*;
public class FactorialMethod {
    public static void main(String[] args){
        // Write a program to print the factorial of a number by defining a method named 'Factorial'.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
        sc.close();
    }
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }   
    }
} 