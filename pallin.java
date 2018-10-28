// pallindrome of string
import java.util.Arrays;
import java.util.Scanner;
class pallin
{
	public static void main(String args[])
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter a string");
		
		String str=in.nextLine();
		char[] a=str.toCharArray();
		int n=a.length;
		System.out.println("length"+n);
		int i=0,flag=0;
		while(i<=n)
		{
			if(a[i]==a[n-1])
			{
			i++;n--;
			}
			else 
			{
			flag=1;
			break;

			}
		}
		if(flag==1)
		System.out.println("not pallindrome");
	else
		System.out.println("yes pallindrome");
		
		
	}
	
	
	
	
}