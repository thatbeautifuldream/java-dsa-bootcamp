import java.util.*;
public class Q7 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        //Q7 is to find the Fibonacci of the n number not the factor
//     System.out.print("Enter the number : ");  
//     int number = sc.nextInt();
//     System.out.print("Factors of " + number + " are: ");
//     for (int i = 1; i <= number; ++i){
//       if (number % i == 0){
//           System.out.print(i + " ");
//       }
//     }
//     sc.close();
        //Fibonacci of n number
         System.out.print("Enter the number: ");
            int num = sc.nextInt();
            int n1 = 0, n2 = 1, n3, i;

            System.out.print(n1 + " " + n2);//printing 0 and 1

            for (i = 2; i < num; ++i)//loop starts from 2 because 0 and 1 are already printed
            {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
       
  }
}
