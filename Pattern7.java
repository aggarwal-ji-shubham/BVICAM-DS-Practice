/*
1
121
12321
1234321
123454321
*/
class Pattern7
{
	public static void main(String args[])
	{
		int j=1;
		for(int i=1;i<7;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=1;k<i;k++)
			System.out.print(k);
		
			
			System.out.println();
			
		}
	
	
	}
}