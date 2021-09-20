package Functions;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args){
        // Write a function to find if a number if palindrome or not. Take number as parameter.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
        sc.close();
    }
    public static boolean isPalindrome(int num){
        int temp = num;
        int rev = 0;
        while(temp != 0){
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        return num == rev;
    }
}