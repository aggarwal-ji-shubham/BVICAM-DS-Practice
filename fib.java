// fibonaci checking of a no
import java.util.Scanner;
class fib
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		 int n=in.nextInt();
		 int a=0,b=1,sum=0;
		 while(sum<=n)
		 {
			 sum=a+b;
			 if(sum==n)
			 {
				System.out.println(" fibonaci");
			break;
			 }
			 else{
			 a=b;
			 b=sum;
			 }
			 
		 }
	
	if(sum>n)
					System.out.println("not fibonaci");

	
	}
}