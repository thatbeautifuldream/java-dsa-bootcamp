//Fibonacci upto nth number.
package vishwa;
import java.util.*;
public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0, j = 1,c,k;
        System.out.print(i+" "+j);
        for (c = 2; c < n; c++)
        {
            k = i + j;
            System.out.print(" " + k);
            i = j;
            j = k;
        }
    }
}
