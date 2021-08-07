import java.util.*;
public class Q6 {
    public static void main(String[] args){
        // area of rhombus
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of one diagonal of the rhombus: ");
        double d1 = input.nextDouble();
        System.out.println("Enter the length of the other diagonal of the rhombus: ");
        double d2 = input.nextDouble();
        double area = (d1*d2)/2;
        System.out.println("The area of the rhombus is: " + area);
        input.close();
    }
}
