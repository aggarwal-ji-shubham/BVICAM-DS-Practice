
// to reverse a string
import java.util.Scanner;
import java.util.Arrays;
class revstr
{
	public static void main(String [] args)
	{
		String str="shubham";
		Scanner in=new Scanner(str);
		//System.out.println("str is "+str);
		char [] a=str.toCharArray();
		int n=a.length;
		int i=0;
		System.out.println("str length "+n);
		while(i<=n/2)
		{
			char tmp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=tmp;
			i++;
			
		}
		System.out.println("Reverse string is");
		for(i=0;i<n;i++)
		{
		System.out.println(a[i]);
		}
	}
	
	
	
	
	
	
	
}