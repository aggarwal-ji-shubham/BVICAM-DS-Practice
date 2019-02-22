// to find a no is armstrong or not
import java.util.Scanner;
class arms
{
p
	public static void main(String args[])
	{
			System.out.println("enter a no");
			Scanner in=new Scanner(System.in);
			int num=in.nextInt();
			int tmp=num,rev=0;
			while(num!=0)
			{
				int rem=num%10;
				rev=rev+rem*rem*rem;
				num=num/10;
				
				
			}
		if(tmp==rev)
			System.out.println("Armstrong ");
		else
			System.out.println(" Not Armstrong ");
		
		
	}
}