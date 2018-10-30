// pattern 1
// star pattern
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