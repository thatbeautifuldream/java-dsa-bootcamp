import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        double p = sc.nextDouble();
        System.out.println("Enter Rate of interest");
        double rate = sc.nextDouble();
        System.out.println("Enter time");
        double time = sc.nextDouble();

        System.out.println(compoundInterest(p, rate, time));

    }
    static double compoundInterest(double p,double rate,double time) {
        return p * Math.pow((1 + rate/100),time) - p;
    }
}
