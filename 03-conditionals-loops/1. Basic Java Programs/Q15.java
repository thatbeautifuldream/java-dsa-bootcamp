import java.util.*;
public class Q15 {
    public static void main(String[] args){
        // volume of prism : V = Bh (B = base area, h = height)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the prism");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the prism");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the prism");
        double height = sc.nextDouble();
        double volume = length * width * height;
        System.out.println("The volume of the prism is " + volume);
        sc.close();
    }
}
