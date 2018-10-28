// palindrome of integer no
import java.util.Scanner;
class palno

{
	public static void main(String args[])
	{
	
		System.out.println("enter a no");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int tmp=n,rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
	
		}
		if(tmp==rev)
			System.out.println("palindrome");
		else
			System.out.println(" not palindrome");
	}
	
}