//Printing Armstrong Numbers between the range of 2 integers.
package vishwa;

import java.util.*;
public class ArmstrongNum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        for(int i=n1;i<n2;i++)
        {
            int c=i,rem,sum=0;
            while(c!=0)
            {
                rem=c%10;
                sum=sum+(rem*rem*rem);
                c/=10;
            }
            if(sum==i)
            {
                System.out.println(i+" is an Armstrong Number");
            }
        }
    }
}
