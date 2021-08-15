import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        // Perimeter Of Parallelogram
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base and height of the parallelogram");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double perimeter = (base * 2) + (height * 2);
        System.out.println("Perimeter of the parallelogram is " + perimeter);
        scanner.close();
    }
}
