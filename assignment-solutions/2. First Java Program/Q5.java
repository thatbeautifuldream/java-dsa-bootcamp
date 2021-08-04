import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print("Enter the first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the operator (+, -, *, /) : ");
        String op = sc.next();
        double result = 0;
        if (op.equals("+")) {
            result = num1 + num2;
        }
        else if (op.equals("-")) {
            result = num1 - num2;
        }
        else if (op.equals("*")) {
            result = num1 * num2;
        }
        else if (op.equals("/")) {
            result = num1 / num2;
        }
        System.out.println("The result is " + result);
    }
}
