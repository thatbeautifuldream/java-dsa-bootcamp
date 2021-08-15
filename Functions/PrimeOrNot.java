import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args){
        // Define a method to find out if number is prime or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
        sc.close();
    }
    public static boolean isPrime(int num){
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}