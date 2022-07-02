package linearsearch;
import java.io.*;
class linearsearch

{

	int a[];

	int size;

	BufferedReader o1=new BufferedReader(new InputStreamReader(System.in));

	linearsearch(int k)

	{

		size=k;

		a= new int[k];

	}

	void input() throws IOException

	{

		
System.out.println("Enter the elements of an array");

	    for(int i=0;i<this.size;i++)

	    	this.a[i]=Integer.parseInt(o1.readLine());

	}
	void search() throws IOException
	{
		int i,x;
		System.out.println("Enter the element to be searched");
		x=Integer.parseInt(o1.readLine());
		for(i=0;i<this.size;i++)
	    	if(this.a[i]==x)
	    	{
	    		System.out.println("Element found at position"+(i+1));
	    		break;
	    	}
		if(i==size)
			System.out.println("Element not found");
	}
}
public class Javalinearsearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		linearsearch o1 =new linearsearch(5);
	       o1.input();
	       o1.search();
		}
	}


