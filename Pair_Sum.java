// to find all pairs of given sum
import java.util.Arrays;
class Pair_Sum
{
	static void bsort(int a[],int n)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a[j]>a[j+1])
					{
						int tmp=a[j];
						a[j]=a[j+1];
						a[j+1]=tmp;
					}
					
				}
			}
			
		}	
		
		
	public static void main(String [] args)
	{
	
		int arr[]={0,3,2,5,6,7,9,21,43,52,53,54,55,56,57,58,59,60};
		int ans=60;
		
		
		int j=0,n=arr.length-1;
		System.out.println("total nos in your array are "+n);
		bsort(arr,n);
		System.out.println("array is sorted now ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		for(int i=0;i<arr.length;i++)
		{
				if(	(arr[j]+arr[n])<ans)
				{
					if(arr[j]+arr[n]==ans)
					{
					System.out.println("pairs are "+arr[j]+" "+arr[n]);	
					//break;
					}
					j++;
				}
				else 
				{
					if(arr[j]+arr[n]==ans)
					{
					System.out.println("pairs are "+arr[j]+" "+arr[n]);	
					//break;
					}
					
						n--;
						
				}
		
		}
		
	}
	
}