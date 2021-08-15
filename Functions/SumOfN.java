import java.util.*;
public class SumOfN {
    public static void main(String[] args){
        // Write a function that returns the sum of first n natural numbers.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = in.nextInt();
        int sum = sumOfN(n);
        System.out.println("The sum of N natural numbers : " + sum);
        in.close();
    }
    public static int sumOfN(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
