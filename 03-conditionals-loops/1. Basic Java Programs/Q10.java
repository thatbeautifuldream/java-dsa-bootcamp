import java.util.Scanner;
public class area_Parallelogram {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the base of Parallelogram: ");
        float base= in.nextFloat();
        System.out.println("Enter the side of Parallelogram: ");
        float side= in.nextFloat();
        System.out.println("The perimeter of the parallelogram is : " +2*(base+side));
    }
}
