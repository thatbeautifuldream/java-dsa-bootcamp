package Functions;
import java.util.*;
public class MaxMin {
    public static void main(String[] args){
        // Define two methods to print the maximum and the minimum number respectively among three numbers entered by user
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Maximum number is " + max(a, b, c));
        System.out.println("Minimum number is " + min(a, b, c));
        in.close();
    }
    static void max(int n1, int n2, int n3)
    {
        System.out.println("the maximum is : " +Math.max(n1,  Math.max(n2, n3)));
    }

    static void min(int n1, int n2, int  n3)
    {
        System.out.println("the minimum is : " +Math.min(n1, Math.min(n2, n3)));
    }
}
