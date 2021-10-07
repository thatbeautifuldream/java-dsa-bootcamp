import java.util.*;
public class Q19 {
    public static void main(String[] args){
        // Curved Surface Area of cube
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the cube");
        double side = in.nextDouble();
        double curvedSurfaceArea = 6*side*side;
        System.out.println("The total surface area of the cube is " + curvedSurfaceArea);
        in.close();
    }
}
