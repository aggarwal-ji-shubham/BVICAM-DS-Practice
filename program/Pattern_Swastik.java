// patter 1
// swastik pattern
import java.util.Scanner;

class Pattern_Swastik
{
	public static void main(String args[])
	{
		
		System.out.println("enter the no of lines");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String a[][]=new String[n][n];
		for(int j=0;j<n;j++)
		{
			
			for(int i=0;i<n;i++)
			{
				
					a[j][i]=" ";
				if(i==n/2)
					a[j][i]="*";
				if(j==n/2)
					a[j][i]="*";
				if(i==0&&j<=n/2)
					a[j][i]="*";
				if(i==n-1&&j>n/2)
					a[j][i]="*";
				if(j==0&&i>n/2)
					a[j][i]="*";
				if(j==n-1&&i<n/2)
					a[j][i]="*";
			}
			
			
			
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);	
				System.out.print(" ");
		}
			
				System.out.println();
		
		}
	}
	
}



