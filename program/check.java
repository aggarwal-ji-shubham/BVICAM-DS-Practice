// to check whether 2 nos are equal or not without using opertaor ==
/*
test cases:
input :-
3
90
o/p not same  */
import java.util.Scanner;
class check
{
	public static void main(String args[])
	{
		
		System.out.println("enter 2 nos");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		check(a,b);
		
		
	}
	static void check(int a,int b)
	{
		if((a-b)==0) // if nos are same than only there differnce is 0
			System.out.println("numbers are same");
		else
			System.out.println("not same");
		
		
	}
	
}