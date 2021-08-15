import java.util.*;
public class PrimeNumbersInInterval {
    public static void main(String[] args){
        // Write a function that returns all prime numbers between two given numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();
        int[] primeNumbers = getPrimeNumbers(firstNumber, secondNumber);
        for(int i = 0; i < primeNumbers.length; i++){
            if(primeNumbers[i] != 0){ // skipping the zeros at the end of the array
            System.out.println(primeNumbers[i]);
            }
        }
        sc.close();
    }
    public static int[] getPrimeNumbers(int firstNumber, int secondNumber){
        int[] primeNumbers = new int[secondNumber - firstNumber + 1];  // +1 because we want to include the second number
        int number = firstNumber;
        int index = 0;
        while(number <= secondNumber){
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeNumbers[index] = number;
                index++;
            }
            number++;
        }
        return primeNumbers;
    }
}