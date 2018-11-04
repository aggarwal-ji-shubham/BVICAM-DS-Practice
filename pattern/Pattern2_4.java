// space star pattern
/*
******
 *****
  ****
   ***
    **
	 *
*/
class Pattern2_4
{
	public static void main(String args[])
	{
		for(int i=0;i<6;i++)
		{
			for(int k=0;k<i-k;k++)
				System.out.print(" ");		// space loop
				for(int j=0;j<6-i;j++)		// "6-i" ==> first time n times,than n-1 times, keep on decreasing
					System.out.print("*");
		
		   System.out.println();
	


		
		}

	}
}	 