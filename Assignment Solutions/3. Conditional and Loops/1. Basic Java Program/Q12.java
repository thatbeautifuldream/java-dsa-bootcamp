import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        // Perimeter of square
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square: ");
        double side = sc.nextDouble();
        System.out.println("The perimeter of the square is " + (side * 4));
        sc.close();
    }
}