import java.util.*;
public class Q18 {
    public static void main(String[] args){
        // volume of pyramid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid: ");
        int height = sc.nextInt();
        System.out.println("Enter the base of the pyramid: ");
        int base = sc.nextInt();
        int volume = (height * base * base) / 3;
        System.out.println("The volume of the pyramid is: " + volume);
        sc.close();
    }
}
