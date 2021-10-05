import java.util.Scanner;
public class area_Rhombus {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the side of Rhombus: ");
        float side= in.nextFloat();
        System.out.println("ans is: " + (side*4));
        in.close();
    }
}
