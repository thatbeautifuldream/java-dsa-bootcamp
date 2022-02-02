import java.util.Scanner;
public class Q2 {
  public static void main(String args[])
  {
    int num;
    System.out.print("Enter an Integer number:");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    if ( num % 2 == 0 ) {
        System.out.println("Entered number is even");
    }
    else {
     System.out.println("Entered number is odd");
    }
  }
}
