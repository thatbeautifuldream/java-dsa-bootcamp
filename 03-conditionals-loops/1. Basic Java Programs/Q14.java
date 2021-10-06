import java.util.*;
public class Q14 {
    public static void main(String[] args){
        // volume of cone
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cone: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the cone: ");
        double height = sc.nextDouble();
        double volume = (Math.PI * radius * radius) * height / 3;
        System.out.println("The volume of the cone is: " + volume);
        sc.close();
    }
}
