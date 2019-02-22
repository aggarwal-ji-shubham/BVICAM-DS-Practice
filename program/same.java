// same check ques do with to string ();
/*
test cases:-
input 1 :
890
907
o/p not same 
input 2:
456
456
o/p same  */
import java.util.Scanner;
class same{
	
	public static void main(String agrs[])
	{
		System.out.println("enter 2 nos");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		check(a,b);// fuction to check 2 nos;
		
		
		
	}
	
	
	static void check(int a,int b)
	{
		String s1=Integer.toString(a);  // coverting the no into tostring 
		String s2=Integer.toString(b);  // same as above
		
		if(s1.equals(s2)) // now comparing like string using equals()
		System.out.println("same");
	else
		System.out.println("not same");
		
	}
	
}