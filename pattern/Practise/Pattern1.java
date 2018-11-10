// practice pattern
// outer loop maze ques
/*
input 
1  2  3  4  5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
*/
import java.util.Scanner;
class Pattern1
{
	public static void main(String args[])
	{   int count=1;
		System.out.println("enter the size of matrix");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[][]=new int[n][n];
		int k=0;
		while(k<n/2)
		{
			int i=0+k;
			int j=0+k;
			while(j<=n-k)
			{
				a[i][j]=count;
				count++;
				j++;
				if(j==n)
				 j--;
			
			}
			
			i++;
			while(i<=n-k)
			{
				
				
				a[i][j]=count;
				count++;
				i++;
				if(i==n)
					i--;
			
			}
			
			while(j>=k)
			{
				j--;
				
				a[i][j]=count;
				count++;
				if(j==k-1)
					j++;
			}
			
			while(i>k)
			{
				i--;
				
				a[i][j]=count;
				count++;
				if(i==k)
					i++;
			}
			
			k++;
			//n--;
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





