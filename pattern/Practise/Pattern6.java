/*
output:
12344321
123**321
12****21
1******1
*/

class Pattern6
{
	public static void main(String args[])
	{
		int row=4,col=8,k=0;
		for(int i=1;i<=row;i++)
		{
			int value=1;
			for(int j=1;j<col;j++)
			{
				while(value<=row-k)
				{
					System.out.print(value);
					value++;
				}
				
				for(int a=1;a<i;a++)
					System.out.print("**");

				while(value>row-k&&value<=col)
				{
					System.out.print(--value);
					value--;
				}
				
			}
			System.out.println();
			k++;
		}
	}
}