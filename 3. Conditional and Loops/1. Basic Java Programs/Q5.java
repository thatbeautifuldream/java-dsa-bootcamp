import java.util.*;
public class Q5 {
    public static void main(String[] args){
        // area of parellogram
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and height of the parellogram : ");
        double b = input.nextDouble();
        double h = input.nextDouble();
        double area = b * h;
        System.out.println("Area of parellogram is " + area);
        input.close();
    }
}
