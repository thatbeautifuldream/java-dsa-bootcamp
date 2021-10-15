import java.util.Scanner;
class Que16
{
	static int fact(int num)
	{
		int f=1;
		for (int i=1;i<=num ;i++ ) 
		{
			f*=i;	
		}
		return f;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = sc.nextInt();
		System.out.println("Enter value of r: ");
		int r = sc.nextInt();
		if(n>=r)
		{
			System.out.println(n+"c"+r+": "+ fact(n)/(fact(n-r)*fact(r)));
			System.out.println(n+"p"+r+": "+ fact(n)/(fact(n-r)));
		}
	}
}
