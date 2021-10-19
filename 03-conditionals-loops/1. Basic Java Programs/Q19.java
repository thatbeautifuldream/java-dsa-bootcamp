import java.util.*;
public class Q19 {
    public static void main(String[] args){
        // Curved Surface Area of cube
        Scanner in = new Scanner(System.in);
//         System.out.println("Enter the side of the cube");
//         double side = in.nextDouble();
//         double curvedSurfaceArea = 6*side*side;
//         System.out.println("The total surface area of the cube is " + curvedSurfaceArea);
        
//         Q19 is to find Curved Surface Area Of Cylinde
        System.out.println("Enter the radius of the cylinder");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double h= sc.nextDouble();
        double curvedSurfaceArea = 2*Math.PI*r*h;
        System.out.println("Curved Surface Area Of Cylinder is " + curvedSurfaceArea);
        in.close();
        
    }
}
