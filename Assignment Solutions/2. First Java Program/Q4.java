import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        double p,r,t,si;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle : ");
        p = sc.nextDouble();
        System.out.print("Enter the Rate : ");
        r = sc.nextDouble();
        System.out.print("Enter the Time : ");
        t = sc.nextDouble();
        si = p*r*t/100;
        System.out.println("Simple Interest is : " + si);
    }
}