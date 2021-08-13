import java.util.*;
public class Q21 {
    public static void main(String[] args){
        // fibbonaci series
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms in the fibbonaci series :");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            System.out.print(b + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        input.close();   
    }
}
