//  find conuinous array max sum
import java.util.Arrays;

class Contarr
{
	public static void main(String [] args)
	{
		int arr[]={10,20,5,-8,-4,52};

		int gmax=0,lmax=0;
		for(int i=0;i<arr.length;i++)
		{
			lmax+=arr[i];
			if(lmax>gmax)
				gmax=lmax;
			if(lmax<0)
				lmax=0;
			
	
		}
		System.out.println("max sum is "+gmax);
	}
	
}