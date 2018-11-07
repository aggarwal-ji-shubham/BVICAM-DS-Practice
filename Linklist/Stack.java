// stack using link list
/*
input :-push(10);
		push(20);
		pop();
		push(30);
		push(40);
		pop();
		display();
output :- element pushed 10;
		elemnt piushed 20;
		element deleted 20;
		element pushed 30;
		element pushed 40;
		element deleted 40;
		
*/		
class node
{
	int data;
	node link;
	
	// constructor
	node(int data,node n)
	{
		this.data=data;
		this.link=n;
	}

}

// linklist
class link
{
	node top;
	int size=0;
	void push(int data)
	{
		node n=new node(data,null);
		if (top==null)
			top=n;
		else
		{
		  n.link=top;
			top=n;
		
		}
		size++;
		System.out.println("element pushed");
	}
	void pop()
	{
		if(size==0)
			System.out.println("underflow");
		else{
			node n=top;
			top=n.link;
		}
		size--;
		System.out.println("element deleted");
		
	}
	
	void display()
	{
		if(size==0)
			System.out.println("nothing to print");
		else
		{
			node n=top;
			while(n!=null)
			{
				System.out.println(n.data+" ");
				n=n.link;
			}
		}
		System.out.println("top data is "+top.data);
		
	}
}
// main class
class Stack
{
	public static void main(String args[])
	{
		link l=new link();
		l.push(10);
		l.push(20);
		l.pop();
		l.push(30);
		l.push(40);
		l.pop();
		l.display();
	}
	
}