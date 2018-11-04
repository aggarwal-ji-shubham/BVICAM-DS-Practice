// star pattern
// ques 1_3
/*
1010101010
 10101010
  101010
   1010
    10
	 1
	 0
	10
   1010	
 10101010 
 
 */
 class Pattern1_3
 {
	 public static void main(String args[])
	 {
		 
		 for(int i=1;i<6;i++)
		 {
			 for(int k=1;k<i;k++)
				 System.out.print(" "); 	// to print above triangle 
			 for(int j=6;j>i;j--)
				 System.out.print("10");
			 System.out.println();
		}
		for(int k=1;k<6;k++)
		System.out.print(" ");
				System.out.println("1");		// to print mid 1 and 0

				for(int k=1;k<6;k++)
		System.out.print(" ");
				System.out.println("0");
		
		for(int i=1;i<6;i++)
		{
			for(int k=6;k>i;k--)
				System.out.print(" ");				// to print below triangle
			for(int j=1;j<=i;j++)
				System.out.print("10");
			System.out.println();
			
			
		}
	}
	 
	 
	 
	 
	 
 }