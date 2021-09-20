import java.util.*;
public class Q13 {
    public static void main(String[] args){
        // perimeter of rhombus
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of one side of the rhombus: ");
        double side = sc.nextDouble();
        System.out.println("Enter the length of the other side of the rhombus: ");
        double side2 = sc.nextDouble();
        double perimeter = (side + side2) * 2;
        System.out.println("The perimeter of the rhombus is " + perimeter);
        sc.close();
    }
}
