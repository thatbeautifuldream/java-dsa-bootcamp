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
    public static int max(int a, int b, int c){
        int max = a;
        if(b > max)
            max = b;
        System.out.println( b + " is the maximum number.");
        
        if(c > max)
            max = c;
        return max;
    }
    public static int min(int a, int b, int c){
        int min = a;
        if(b < min)
            min = b;
        System.out.println( b + " is the minimum number.");
        
        if(c < min)
            min = c;
        return min;
    }
}
