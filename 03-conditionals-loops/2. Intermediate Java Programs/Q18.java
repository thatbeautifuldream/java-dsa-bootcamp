//18.Find if a number is palindrome or not

import java.util.*;

public class Q18{
    public static void main(String[] args) {
        int num,newNum,rev=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        newNum = num;
        //reversing a number
        while(num != 0){
            rev = num % 10 + rev * 10;
            num /= 10;
        }
        //checking
        System.out.print((rev == newNum)?"Palindrome":"NOT Palindrome");

    }
}
