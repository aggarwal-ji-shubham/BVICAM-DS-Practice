// pattern 1
// star pattern
/*
1234567
123456
12345
1234
123
12
76
765
7654
76543
765432
7654321
*/

class Pattern1_2
{
	
	public static void main(String args[])
	{
	
		for(int i=9;i>1;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				
			}
				System.out.println();
		}
		
		for(int i=8;i>=1;i--)
		{
			for(int j=9;j>=i;j--)
				System.out.print(j);
			System.out.println();
			
		}
	
	}
	
}