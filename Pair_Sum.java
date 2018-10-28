// to find all pairs of given sum
import java.util.Arrays;
class Pair_Sum
{
	
	private static void selSort(int a[],int n)		//selection sort
		{
			for(int i=0;i<a.length;i++)
			{
				//System.out.println("&"+a[i]);
				int min=i;					//assinging minimum position to 1st 
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]<a[min])
					{
						min=j;				//if 2nd is greater tha 1st
					}
					
				}
					int tmp=a[i];
					a[i]=a[min];			// swapping
					a[min]=tmp;
			}
		}	
		
		
	public static void main(String [] args)
	{
	
		int arr[]=new int[]{0,3,2,5,6,7,9,21,43,52,53,54,55,56,57,58,59,60,22,23,24,25};
		int ans=60;
		
		
		int j=0,n=arr.length-1;
		System.out.println("total nos in your array are "+n);
		selSort(arr,n);		// calling the selection sort
		System.out.println("array is sorted now ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);	// printing the sorted array
		
	while(j<n)
		{
				
				if((arr[j]+arr[n])==ans)
				{
					
					System.out.println("pairs are "+arr[j]+" "+arr[n]);	
					//break;
					j++;
					n--;
					
				}
				else if((arr[j]+arr[n])<ans)
					{
					j++;
					}
				
					else if((arr[j]+arr[n])>ans)
					{
					n--;
					//break;
					}
					
						
						
				
		
		}
		
	}
	
}