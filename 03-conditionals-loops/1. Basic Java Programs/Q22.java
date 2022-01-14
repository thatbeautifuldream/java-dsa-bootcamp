import java.util.Scanner;

public class Q22 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();

            int sum = 0;
            int product = 1;

            while(num > 0) {
                int rem = num % 10;
                sum += rem;
                product *= rem;
                num /= 10;

            }
            System.out.println(product-sum);

        }
    }
