import java.util.*;
public class Q18 {
    public static void main(String[] args){
        // volume of pyramid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid: ");
        double height = sc.nextInt();
        System.out.println("Enter the width of the pyramid: ");
        double width = sc.nextInt();
        System.out.println("Enter the length of the pyramid: ");
        double length = sc.nextInt();
        double volume = (height * width * length) / 3;
        System.out.println("The volume of the pyramid is: " + volume);
        sc.close();
    }
}
