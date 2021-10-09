import java.util.*;
public class DigitFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        sc.close();
    }
    public static int getDigitFrequency(int n, int d) {
        int count = 0;
        while(n > 0) {
            int rem = n % 10; // last digit gets stored in rem
            if(rem == d) {
                count++; // increment count if rem is equal to d
            }
            n = n / 10; // remove last digit
        }
        return count;
    }
}
