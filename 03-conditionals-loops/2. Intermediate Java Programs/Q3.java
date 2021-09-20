import java.util.*;
public class Q3 {
    public static void main(String[] args){
        // Calculate Average Of N Numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n = in.nextInt();
        int sum = 0;
        System.out.println("Enter the "+n+" elements respectively :");
        for(int i = 0; i < n; i++){
            int num = in.nextInt();
            sum += num;
        }
        double average = (double)sum / n;
        System.out.println(average);
        in.close();
    }
}