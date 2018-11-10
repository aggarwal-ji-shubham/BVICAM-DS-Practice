/*
input: 
0
0 2
0 3 6
0 4 8 12
0 5 10 15
*/
class Pattern8
{
	public static void main(String args[])
	{
		int value=1;
		for(int i=0;i<6;i++)
		{
			int k=0;
			System.out.print("0");
			for(int j=0;j<i;j++)
			{
				
				k+=value;
				System.out.print(" "+k+" ");
			}
			value++;
			System.out.println();
		}
	}

}