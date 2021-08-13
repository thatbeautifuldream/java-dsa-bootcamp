import java.util.*;
public class VoteEligiblity {
    public static void main(String[] args){
        // A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        if(eligible(age)){
            System.out.println("You are elligible to vote");
        }
        else{
            System.out.println("You are not elligible to vote");
        }
        sc.close();
    }
    public static boolean eligible(int age){
        return age >= 18;
    }
}
