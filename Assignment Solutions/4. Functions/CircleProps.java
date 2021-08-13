import java.util.*;
public class CircleProps {
    public static void main(String[] args) {
        // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();
        System.out.println("The circumference of the circle is " + calculateCircumference(radius));
        System.out.println("The area of the circle is " + calculateArea(radius));
        sc.close();
    }
    public static double calculateCircumference(double radius){
        return 2 * Math.PI * radius;
    }
    public static double calculateArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
}
