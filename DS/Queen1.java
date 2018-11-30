// N-queen problem
import java.util.Scanner;
class Queen1
{
	 public static int isplace(int[] chess[],int r,int c)
	{ 
		int i=0,j=0;
		for(i=0;i<r;i++)
		{
			if(chess[r][c]==1)
				return 0;
		}
		for(i=r-1,j=c+1;i>=0&&j<4;i--,j++)
		{
			if(chess[i][j]==1)
				return 0;
		}
			for(i=r-1,j=c-1;i>=0&&j>=4;i--,j--)
			{
				if(chess[i][j]==1)
					return 0;
			}
		return 1;
	}
		//main class
	public static void main(String args[])
	{
		int chess[][]=new int[4][4];
		System.out.println("Ente the value of row and col");
		Scanner in=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				chess[i][j]=in.nextInt();
			}
		}
		int ans[][]=new int[4][4];
		int value;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				int r=i,c=j;
				value=isplace(chess,r,c);
				ans[i][j]=value;
			}
		}
			System.out.println("you can place at particular position");
			for(int i=0;i<4;i++)
			{	
				for(int j=0;j<4;j++)
				{	
					
					System.out.print(ans[i][j]);
				}
				System.out.println();
			}
		
	}


}