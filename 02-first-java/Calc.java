// Calculator.
package vishwa;
import java.util.*;
class Calc{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        char ch=in.next().charAt(0);
        switch(ch){
            case '+': System.out.println(a+b);
            case '-': System.out.println(a-b);
            case '*': System.out.println(a*b);
            case '/': System.out.println(a/b);
        }
    }
}