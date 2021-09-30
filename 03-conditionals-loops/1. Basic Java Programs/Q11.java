import java.util.Scanner;
public class area_rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the lenght of rectangle: ");
        float rect_len = in.nextFloat();
        System.out.println("enter the width of rectangle: ");
        float rect_wid = in.nextFloat();
        System.out.println("ans is: " + (rect_len * rect_wid));
    }
}
