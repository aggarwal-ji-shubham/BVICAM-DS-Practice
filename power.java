// checking a no is power of  2
/* test cases:
1: 69
o/p not in power of 2
2:128
o/p its power of 2 is 7 */
import java.util.Scanner;
class power
{
	public static void main(String args[])
	{
	System.out.println("enter a no");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();  // input a no in n
	int i=1,power=2;
	while(power<=n)
	{
		if(power==n)
			System.out.println("its  power  of 2 is "+i);
		power=power*2;
		i++; // to count whict power of 2 is a no
	}	
	if(power!=n)
		System.out.println("not in power of 2");

	
	}
	
	
	
	
	
	
	
}