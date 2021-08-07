import java.util.*;
public class Q8 {
    public static void main(String[] args){
        // Perimeter of circle
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();
        System.out.println("The perimeter of the circle is " + (2 * Math.PI * radius));
        input.close();
    }
}
