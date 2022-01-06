import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.println(power(x, n));
        in.close();
    }
    public static int power(int x, int n) {
        if (n == 0) {
            return 1; // n^0 = 1
        }
        return x * power(x, n - 1); // n^n = n * n^(n-1)
    }
}
