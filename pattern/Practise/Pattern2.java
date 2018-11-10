/*input :

   1
  2 2
 3   3
4     4
 3   3
  2 2
   1
   
 */  
class Pattern2
{
	public static void main(String args[])
	{
	    int  k1=0,v1=0;
		int  a[][]=new int[8][8];
		int  k=0,value=1; // k is for space maintaining and value is for putting actual value
		for(int i=0;i<8;i++)
		{
			int j=3;
			if(value>4)
			{
				k1--;v1=v1-1;
				a[i][j-k1]=v1;
				a[i][j+k1]=v1;
			}
			if(value<=4)
			{
			a[i][j-k]=value;
			a[i][j+k]=value;
			k++;value++;
			k1=k;v1=value;
			}
			if(j!=3)
			a[i][j]=0;
		}
		// print pattern
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
	}
}