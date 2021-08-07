import java.util.*;
public class Q1{
    public static void main(String[] args){
    // area of circle
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius : ");
    double radius = input.nextDouble();
    double area = 3.14 * radius * radius;
    System.out.println("Area of circle with radius " + radius + " units is " + area + " unit squared.");
    input.close();
    }
}