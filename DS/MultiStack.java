// Implement multi stack
/*
input n=10
make 2 stacks
stack1 :0-4
stack2 :5-9
perform : push
		  pop
		  display
		  
*/	  
import java.util.Scanner;

class MultiStack

{	int arr[]=new int[10];
	int top1=0;
	int top2=5;
		void push(int data,int start,int last,int choice)
	{
		if(top1==last || top2==last)
			System.out.println("overflow");
		else
		{
			if(choice==1)
			{
				arr[top1]=data;
				top1++;
			}
			else
			{
				arr[top2++]=data;
			}
		}
			
	}
	 void pop(int start,int last,int choice)
	{
		if(top1==start||top2==start)
			System.out.println("underflow");
		else
		{
			if(choice==1)
				top1--;
			else
				top2--;
		}
	}
	
void display(int start,int last,int choice)
	{
			if(top1==start||top2==start)
				System.out.println("underflow");
			else
			{
				int tmp1=top1;
				int tmp2=top2;
				if(choice==1)
				{
					while(tmp1>=0)
					System.out.print(" "+arr[tmp1--]);
				
				}
				else
				{
					while(top2>=start)
					{
						System.out.print(arr[tmp2--]);
					}
					
				}
			}
	}
	
	// main function
	public static void main(String args[])
	{	
		int data=0;
		int start=0;
		int last=0;
		int flag=0;
		
		Scanner in=new Scanner(System.in);
		
		MultiStack obj2=new MultiStack();
		do
		{
			System.out.println("1.push\n2.pop\n3.display");
			int ch=in.nextInt();
			System.out.println("enter the stack choice 1or2");
		int choice=in.nextInt();
		if(choice==1)
		{
			 last=4;
			start=0;
		}
		else
		{
			 last=9;
			 start=5;
		}
		
		
			switch(ch)
			{
				case 1:  obj2.push(data,start,last,choice);
				break;
				case 2:  obj2.pop(start,last,choice);
				break;
				case 3:	 obj2.display(start,last,choice);
				break;
			}
			if(ch==1)
			{
			System.out.println("enter the data");
			 data=in.nextInt();
			}
			System.out.println("do u want more 1/2");
			flag=in.nextInt();
		}while(flag==1);
	/*	push(data,start,last,choice);
		//choice();
		push(data,start,last,choice);
		choice();
		push(data,start,last,choice);
		choice();
		push(data,start,last,choice);
		choice();
		push(data,start,last,choice);
		choice();
		pop(start,last,choice);
		choice();
		pop(start,last,choice);
		choice();
		display(start,last,choice);
	*/
	}
}