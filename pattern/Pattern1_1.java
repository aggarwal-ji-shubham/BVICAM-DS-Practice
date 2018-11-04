// pattern 1_1
// star pattern with space
/*
	    *
	   **
	   ***
	  *****
	   ***
	   **
		*
		
*/		
class Pattern1_1
{
	public static void main(String args[])
	{
		for(int i=0;i<4;i++)		// normal increament loop
		{
			for(int k=4;k>i;k--)
			{
				System.out.print(" ");		// space loop
			}
			for(int j=1;j<=2*i+1;j++)
			{	
				System.out.print("*"); 		// star loop
			}
				System.out.println();
			
		}
		for(int i=4;i>0;i--)
		{
			
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}										// same done for lowrr triangle	
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
		

}