// program to find position of no in an array using binary search
/*
test cases:
input : size of array is 5
array :1,2,2,3,4
o/p: find at index 0 */
import java.util.Scanner;
import java.util.Arrays;
class position
{
	
	public static void main(String args[])
	{
		System.out.println("enter the array size");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();   // size of array
		System.out.println("enter the array");
		int arr[]=new int[n];
		int i=0;     // using for array index
		while(i<n)
		{
			arr[i]=in.nextInt();
			i++;
			
		}
		System.out.println("enter the no u want to search");
		int num=in.nextInt(); // no to be searched
		bsearch(arr,n,num);
		
		
		
		
	}
	
	static void bsearch(int arr[],int n,int num)
	{
		int i=0;
		int beg=0;
		int last=n-1;
		while(i<=n)
		{
			int mid=(beg+last)/2;	// find the middle index
			    if(num==arr[mid])
				{
				System.out.println(" your no "+num+" is found at position "+mid);
				break;
				}
				if(num>arr[mid])
				beg=mid+1;			// shift the position of begining 
				if(num<arr[mid])
				last=mid-1;			// shift the position of last index of original array 
			i++;
		}
	}
	
	
}