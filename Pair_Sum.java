// to find pairs of given sum
import java.util.Arrays;
class Pair_Sum
{
	public static void main(String [] args)
	{
	
		int arr[]={7,2,3,5,6};
		int ans=13;
		for(int i=0;i<arr.length;i++)
		{
			int pair1=arr[i];
			for(int j=0;j<arr.length;j++)
			{
				int sum=pair1+arr[j];
				if(sum==ans)
					System.out.println("max sum is "+pair1+" "+arr[j]);
				
			
	
			}
		}
	}
	
}