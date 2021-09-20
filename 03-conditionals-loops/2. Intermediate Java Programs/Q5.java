import java.util.*;
public class Q5 {
    public static void main(String[] args){
        // Calculate Distance Between Two Points
        Scanner scanner = new Scanner(System.in);
        int x1, x2, y1, y2;
        double distance = 0;
        System.out.println("Enter the coordinates of the first point (x1,y1): ");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        System.out.println("Enter the coordinates of the second point (x2,y2): ");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        // using the distance formula
        distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("The distance between the two points is " + distance);
        scanner.close();
    }
}
