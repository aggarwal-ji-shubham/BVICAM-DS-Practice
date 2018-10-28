// remove particular character from string
import java.util.Scanner;
import java.util.Arrays;
class remstr
{
	
	public static void main(String args[])
	{
	
		System.out.println("enter a string");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
	//	System.out.println("enter a charcter that want to remove");
	//	char b=in.next().CharAt(0);
		char []a=str.toCharArray();
		int i=0,n=str.length();
		System.out.println(n);
		while(i<=n)
		{
			if(a[i]=='v')
				a[i]='x';
			
			i++;
		}
	
	System.out.println("after remove ");
	for(i=0;i<n;i++)
	System.out.print(a[i]);
	}
	
}