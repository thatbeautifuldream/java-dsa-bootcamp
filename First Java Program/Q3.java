import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String usersName;
        System.out.print("Please enter your name: ");
        usersName = sc.nextLine();
        System.out.println("Hello, " + usersName + ", greetings from command line!");
    }
}
