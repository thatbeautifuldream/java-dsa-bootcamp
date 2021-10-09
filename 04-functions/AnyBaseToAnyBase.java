import java.util.*;
public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int d = getValue(n,b1,b2);
        System.out.println(d);
        sc.close();
    }

    public static int getValue(int n, int b1, int b2) {
        int dec = anybasetodecimal(n,b1); // a2d
        int dn = decimaltoanybase(dec,b2); // d2a : destination number
        return dn;
    }
    public static int anybasetodecimal(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % 10; // get the last digit
            n /= 10; // remove the last digit
            rv += dig * p; // add the value of the digit to the return value
            p *= b; // increase the power of the base
        }
        return rv;
    }
    public static int decimaltoanybase(int n, int b) {
        int rv = 0; // return value
        int p = 1; // 10^0 = 1
        while(n > 0) {
            int dig = n % b; // get the last digit on dividing by base
            n = n / b; // remove the last digit
            rv += dig * p; // digit times power and add to return value
            p *= 10; // increase power of 10 by 1
        }
        return rv;
    }
}
