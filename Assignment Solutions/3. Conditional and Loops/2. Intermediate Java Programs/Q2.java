import java.util.*;
public class Q2 {
    public static void main(String[] args){
        // electricity bill program
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of kwh used: ");
        double kwh = in.nextDouble();
        System.out.println("Enter the cost of the kwh: ");
        double cost = in.nextDouble();
        System.out.println("Enter the number of days used: ");
        int days = in.nextInt();
        double bill = 0;
        if(kwh > 0 && cost > 0 && days > 0){
            bill = kwh * cost;
            bill = bill / days;
            System.out.println("The bill is: " + bill);
        }
        else{
            System.out.println("Invalid input");
        }
        in.close();
    }
}
