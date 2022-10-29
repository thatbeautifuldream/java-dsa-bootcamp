package vishwa;
import java.util.*;
public class PalindromeOrNot
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str1= in.next();
        reverse(str1);
    }

    static void reverse(String str)
    {
        str=str.toLowerCase();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev))
        {
            System.out.println("Given String is Palindrome.");
        }
        else
        {
            System.out.print("Given String is not a Palindrome.");
        }
    }
}
