import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        // perimeter of rectangle
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        double length = input.nextDouble();
        System.out.println("Enter the width of rectangle");
        double width = input.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of rectangle is " + perimeter);
        input.close();
    }
}