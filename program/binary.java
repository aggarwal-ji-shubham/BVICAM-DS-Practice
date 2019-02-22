// binary search
import java.util.Scanner;
import java.util.Arrays;
class binary
{
	public static void main(String args[])
	{
	//	System.out.println("enter a size array ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	int [] a=new int[20];
	//	System.out.println("enter a array of no");
		for(int i=0;i<n;i++)
		{
			 a[i]=Integer.parseInt(args[i]);
		}
		int l=a.length;
		System.out.println("size"+l);
		
	int low=a[0],high=a[n-1];
	
	
	System.out.println("enter the no u want to search");
		int num=in.nextInt();
	
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(mid==num)
		{
			System.out.println("find no at position "+mid);
			break;
		}	
			else
		{
			if(mid<num)
			 low=mid+1;
			else
			 high=mid-1;
			
		}
		
	}
	}
}