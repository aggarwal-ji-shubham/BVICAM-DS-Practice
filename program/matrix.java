// addition multiplication and transpose in matrix
import java.util.Scanner;
import java.util.Arrays;
class matrix
{ 	
	public static void main(String args[])
	{
	System.out.println("enter the rows of 1st matrinx");
	Scanner in=new Scanner(System.in);
	int m=in.nextInt(); // rows of 1st matrix
	System.out.println("enter the columns of 1st matrinx");
	int n=in.nextInt(); // colums of 2nd matrix
	int ma1[][]=new int[m][n];  //matrix1 of size m*n
	System.out.println("enter the 1st matrix");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			ma1[i][j]=in.nextInt(); // filling matrix
		
		}
	}
	System.out.println("enter the rows of 2nd matrinx");
	int p=in.nextInt(); // rows of matrix2
	System.out.println("enter the columns of 2nd matrinx");
	int q=in.nextInt();  // columns of matrix 2
	int ma2[][]=new int[p][q];
	System.out.println("enter the 2nd matrix");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			ma2[i][j]=in.nextInt();	// filling matrix2
		
		}
	}

 


	
		int ma3[][]=new int[p][q]; // matrix 3 for adittion
		if(m!=p||n!=q) // to check order of both input matrix
		{
			System.out.println("Order of matrix not same");
		}
		else
		{

	System.out.println("adittion of matices are");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			ma3[i][j]=ma1[i][j]+ma2[i][j]; // adittion of both matrix
			System.out.print(ma3[i][j]+" ");
			
		}
		System.out.println();
	}
	


		}	

	
		// multiplication of matrix 
	    int ma4[][]=new int[m][q];	 // matrix for multiplication
		if(n!=p)
				System.out.println("Order of matrix not same");
		else
		{
			System.out.println("multiplication of matices are");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<q;j++)
		{ 
	 ma4[i][j]=0;
			for(int k=0;k<n;k++)
			{
				ma4[i][j]+=ma1[i][k]*ma2[k][j]; // multiplying both matrix
				
			}
			System.out.print(ma4[i][j]+" ");
		
		}
		System.out.println();
	}


			

		}		
				
	
			
			

		 System.out.println("transpose of matrix 2 is");
			int ma5[][]=new int[p][q]; // matrix 5 for transpose
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<q;j++)
				{
					ma5[i][j]=ma2[j][i]; // chnaging position of i and j
					System.out.print(ma5[i][j]+" ");
				}
				System.out.println();
			}
		
		

}	
	
}