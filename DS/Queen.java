// N-queen problem
import java.util.Scanner;
class Queen
{
	 public static boolean isplace(int[] chess[],int r,int c)
	{ 
		int i=0,j=0;
		for(i=0;i<r;i++)
		{
			if(chess[r][c]==1)
				return false;
		}
		for(i=r-1,j=c+1;i>=0&&j<4;i--,j++)
		{
			if(chess[i][j]==1)
				return false;
		}
			for(i=r-1,j=c-1;i>=0&&j>=4;i--,j--)
			{
				if(chess[i][j]==1)
					return false;
			}
		return true;
	}
	public static void main(String args[])
	{
		int chess[][]=new int[4][4];
		System.out.println("Enter the values on chessboard");
		Scanner in=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				chess[i][j]=in.nextInt();
			}
		}
		boolean value;
		int r=1,c=1;
		value=isplace(chess,r,c);
		System.out.println("u can place the queen or not at "+r+","+c+" "+
		value);
		
		
	}


}