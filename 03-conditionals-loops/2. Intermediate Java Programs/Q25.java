//Sum Of A Digits Of Number

import java.util.*;
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println("Sum of digit:" +sum);
    }
}
