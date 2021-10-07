import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        // total surface area of cylinder
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = in.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = in.nextDouble();
        double area = 2 * Math.PI * radius * height;
        System.out.println("The surface area of the cylinder is " + area);
        in.close();
    }
}
