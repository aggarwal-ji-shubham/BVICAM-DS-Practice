// pattern
import java.util.Scanner;
class Pattern
{
	public static void main(String [] args)
	{	
		System.out.println("enter no of lines");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			System.out.print("*");		// above triangle
				System.out.println();
			for(int k=0;k<2*i;k++)
			System.out.print(" ");
		System.out.println();
		  for(int t=0;t<n-i;t++)
		  System.out.print("*");

				
		}
	
	System.out.println();

	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			System.out.print("*");
				System.out.println();
			for(int k=0;k<2*i;k++)
			System.out.print(" ");
		System.out.println();
		  for(int t=0;t<n-i;t++)			// below triangle
		  System.out.print("*");

				
		}
	
	System.out.println();

	}
	
	
	
}