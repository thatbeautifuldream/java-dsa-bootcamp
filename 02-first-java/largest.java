// Largest of 2nums.
package vishwa;
import java.util.*;
class largest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        /*
        if(a>b){
            System.out.println("largest of 2num is a.");
        }
        else{
            System.out.println("largest of 2num is b.");
        }
        */
        //Using methods;
        findbig(a,b);
    }
    static void findbig(int m,int n){
        if(m>n)
            System.out.println("a is the largest.");
        else 
            System.out.println("b is the largest.");
    } 
}