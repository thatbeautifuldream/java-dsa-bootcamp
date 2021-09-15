import java.util.Scanner;
public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(power(n, k));
        sc.close();
    }
    public static int power(int n, int k) {
        if (k == 0) {
            return 1; // n^0 = 1
        }
        if (k == 1) {
            return n; // n^1 = n
        }
        if (k % 2 == 0) {
            return power(n * n, k / 2); // n^k = n^(k/2) * n^(k/2); given k is even
        } else {
            return n * power(n * n, k / 2); // n^k = n^(k/2) * n^(k/2) * n; given k is odd
        }
    }
}
