/*
*****
** **
* * *
** **
*****
*/

import java.util.Scanner;
class Pattern5
{
	public static void main(String args[])
	{
		System.out.println("enter the no of lines");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String a[][]=new String[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==n/2-1&&j==n/2)||(i==n/2+1&&j==n/2)||(i==n/2&&j==n/2-1)||(i==n/2&&j==n/2+1))
				{
					a[i][j]=" ";
				}
				else
				{
					a[i][j]="*";
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}	
	}
}