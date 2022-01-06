import java.util.Scanner;
public class RecursiveSummation {
    public static int recursiveSummation(int inputNumber){
        if(inputNumber == 1){
            return 1;
        }
        return inputNumber + recursiveSummation(inputNumber - 1);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = input.nextInt();
        System.out.println("The sum of the numbers from 1 to " + inputNumber + " is " + recursiveSummation(inputNumber) + ".");
        input.close();
    }
}
