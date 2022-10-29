//Printing INR in USD.
package vishwa;
import java.util.*;
public class USD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        double usd=n*0.012; //currently 1inr is equal to 0.012usd.
        System.out.print("$"+usd);
    }

}
