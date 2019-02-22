// find k largest element from array
import java.util.Scanner;
import java.util.Arrays;
class Largest
{
	public static void main(String [] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter no of elements");
	int n=in.nextInt();
	int arr[]=new int[n];
	System.out.println("enter  elements");
	for(int i=0;i<n;i++)
		arr[i]=in.nextInt();
	Arrays.sort(arr);
	System.out.println("enter the value of k ");
	int k=in.nextInt();
	System.out.println(k+" largest  elements");
	for(int i=n-1;i>=n-k;i--)		// pick last k element
		System.out.println(arr[i]);
}
}