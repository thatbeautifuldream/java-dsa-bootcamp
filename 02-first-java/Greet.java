//Greet a Person.
package vishwa;
import java.util.*;
class Greet{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        String name=in.next();
        System.out.println("Hello "+name+" Welcome to Programmers World!");
        */
        //Using Method();
        String name=in.next();
        greetings(name);
    }
    static void greetings(String greet)
    {
        System.out.println("Hello "+greet+" Welcome to Programmers World!");
    }
}