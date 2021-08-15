import java.util.*;
public class Q17 {
    public static void main(String[] args){
        // volume of sphere
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        double radius = sc.nextDouble();
        System.out.println("Enter the volume of sphere");
        double volume = sc.nextDouble();
        System.out.println("The volume of sphere is " + (volume * 4/3 * Math.PI * radius * radius * radius));
        sc.close();
    }
}
