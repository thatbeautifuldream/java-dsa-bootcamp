import java.util.Scanner;

public class Q15 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("This program checks whether the entered number is armstrong or not.");
        int num;
        while(true){
            System.out.print("Enter a positive integer (0 to exit) : ");
            num = input.nextInt();
            if (num == 0) System.exit(0);
            else {
                if (armstrong_check(num))
                    System.out.println("Yes, It is a armstrong number.");
                else
                    System.out.println("No, It is not a armstrong number.");
            }
        }
    }
    static boolean armstrong_check(int n){
        int temp = n, rem, result = 0, power;
        power = String.valueOf(n).length();
        while(temp != 0){
            rem = temp % 10;
            result += Math.pow(rem, power);
            temp /= 10;
        }
        if(result == n)
            return true;
        else
            return false;
    }
}
