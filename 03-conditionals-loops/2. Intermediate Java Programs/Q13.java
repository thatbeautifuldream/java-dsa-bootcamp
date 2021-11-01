//Addition Of Two Numbers


import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        int n1, n2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        n1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        n2 = sc.nextInt();

        sc.close(); 
        sum = n1 + n2;
        System.out.println("Sum of these numbers: "+sum);
    }
}
