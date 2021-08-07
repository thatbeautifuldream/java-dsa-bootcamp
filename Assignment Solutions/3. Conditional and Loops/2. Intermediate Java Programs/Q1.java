import java.util.*;
public class Q1 {
    public static void main(String[] args){
        //factorial program
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        in.close();
    }
}
