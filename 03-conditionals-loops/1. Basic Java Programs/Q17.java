import java.util.*;
public class Q17 {
    public static void main(String[] args){
        // volume of sphere
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        double radius = sc.nextDouble();
        System.out.println("The volume of sphere is " + (4 * Math.PI * radius * radius * radius)/3);
        sc.close();
    }
}
