// remove space from given string with /
/*
test cases:
1: shubham aggarwal is in bvp
o/p : shubham/aggarwal/is/in/bvp 8 */

import java.util.Scanner;
import java.util.Arrays;

class remspace

{
	public static void main(String args[])
	{
		System.out.println("enter a strin ");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char []a=str.toCharArray();
		int n=a.length;	// to find length of string
		for(int i=0;i<n;i++)
		{
			if(a[i]==' ')
				a[i]='/';		// replace the space with /
		}
		for(int i=0;i<n;i++)
	System.out.print(a[i]);
	
	}
	
	
	
	
}