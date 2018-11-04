// patter 1
// swastik pattern
/*
Sample input
*	  ********
*	  *
*	  *
**************
      *		 *
	  *		 *	
*******	     *
*/
 
	 
import java.util.Scanner;

class Pattern_Swastik
{
	public static void main(String args[])
	{
		
		System.out.println("enter the no of lines");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(); 		// no of lines
		String a[][]=new String[n][n];
		for(int j=0;j<n;j++)
		{
			
			for(int i=0;i<n;i++)
			{
				
					a[j][i]=" ";
				if(i==n/2)
					a[j][i]="*";		// to print
				if(j==n/2)				// + sign first
					a[j][i]="*";
				if(i==0&&j<=n/2)
					a[j][i]="*";		// print upper part	
				if(i==n-1&&j>n/2)
					a[j][i]="*";
				if(j==0&&i>n/2)
					a[j][i]="*";
				if(j==n-1&&i<n/2)		// print lower part
					a[j][i]="*";
			}
			
			
			
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);		// print the pattern
				System.out.print(" ");
		}
			
				System.out.println();
		
		}
	}
	
}



