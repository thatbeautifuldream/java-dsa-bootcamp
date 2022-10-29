// Finding Simple Interest.
package vishwa;
import java.util.*;
class SimpleInterest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int p=in.nextInt();
        int t=in.nextInt();
        int r=in.nextInt();
        int res;
        res=(p*t*r)/100;
        System.out.println(res);
    }
}