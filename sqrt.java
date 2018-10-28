/* test cases :
1: 225
o/p square root of 225 is 15
2: 100
o/p square root of 100 is 10*/

// find the square root of a no
import java.util.Scanner;
class sqrt
{
	public static void main(String args[])
	{
		System.out.println("enter a no ");
		//int n=Integer.parseInt(args[0]);
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=1,sum=0,count=0;
		while(i<=n)
		{
			sum+=i;
			count++;
			i=i+2;
			if(sum>=n)
			{
				break;
			}
			
		
		}
		System.out.println("square root of "+n+" is "+count);
	}
	
	
	
}