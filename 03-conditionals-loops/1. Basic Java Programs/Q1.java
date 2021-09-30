import java.util.Scanner;
public class area_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);       
        System.out.println("enter the circle radius: ");
        float radius = in.nextFloat();
        System.out.println("the area of circle is: " + (3.14 * radius * radius));
        in.close();
    }
}
