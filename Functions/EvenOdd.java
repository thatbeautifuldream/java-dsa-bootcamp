package Functions;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args){
        // Define a program to find out whether a given number is even or odd
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        evenodd(number);
        in.close();
    }
    public static void evenodd(int number){
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}