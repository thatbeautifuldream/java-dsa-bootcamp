import java.util.*;
public class Q21 {
    public static void main(String[] args){
        // fibbonaci series
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms in the fibbonaci series :");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " +b);
        for(int i = 0; i < n; i++){
            int temp = a+b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }
        input.close();   
    }
}
