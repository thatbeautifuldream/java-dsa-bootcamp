import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        // area of traingle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base and height of triangle: ");
        double base = in.nextDouble();
        double height = in.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle is " + area);
        in.close();
    }
}
