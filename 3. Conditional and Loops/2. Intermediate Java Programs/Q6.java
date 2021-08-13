import java.util.*;
public class Q6 {
    public static void main(String[] args){
        // Calculate Commission Percentage
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of sales: ");
        int sales = in.nextInt();
        System.out.print("Enter the commission percentage: ");
        int comm = in.nextInt();
        System.out.print("Enter the number of commission rates: ");
        int rates = in.nextInt();
        System.out.print("Enter the commission rates: ");
        int[] ratesArray = new int[rates];
        for(int i = 0; i < rates; i++){
            ratesArray[i] = in.nextInt();
        }
        // Calculate commission
        int commission = 0;
        for(int i = 0; i < rates; i++){
            if(sales >= ratesArray[i]){
                commission += (sales * comm / 100);
            }
        }
        System.out.println("The commission is: " + commission);
        in.close();
    }
}
