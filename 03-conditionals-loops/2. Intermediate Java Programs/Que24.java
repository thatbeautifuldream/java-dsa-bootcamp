//Check whether enterd year is Leap Year Or Not

import java.util.*;

public class Q24 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Year: ");
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Entered year is a leap year");
        else
            System.out.println("OOPS!!....Entered year is not a leap year");
    }
}
