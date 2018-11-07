 // queue using link list
 class node
 {
	 int data;
	 node link;
	 
	 // constructror
	 node(int data,node n)
	 {
		 this.data=data;
		 this.link=n;
	 
	 }
	 
 }	 
 // class queue
 class link
 {
	 node front;
	 node rear;
	 int size=0;
	 link()
	 {
		 this.front=null;
		 this.rear=null;
	 }
		 
	 // insert in the queue at the end
	 void enque(int data)
	 {
		 node n=new node(data,null);
			System.out.println("element is pushed"+n.data);
		if(rear==null)
		{
			 rear=n;
			 front=n;
		}
		 else
		 {
			 rear=n.link;
			 rear=n;
		 }
		 size++;
		 
	 }
	 
	 // delete from the front
	void deque()
	{
		if(front==null)
			System.out.println("nothing to delete");
		else
		{
			node n=front;
			front=n.link;
			
		}
		System.out.println("element deleted");
		size--;
	}	
	
	// displayb the queue
	void display()
	{
		if(size==0)
			System.out.println("nothing to display");
			else
			{
				System.out.println("queue is:"+front.data);
					node n=front;

				//	System.out.println("front "+n.data);
					while(n!=rear.link)
					{
						System.out.println("while loop"+n.data);
						n=n.link;
					}
			}
	}
 }
 
 // main class
 class Queue
 {
	 public static void main(String args[])
	 {
		 link l=new link();
		 l.enque(10);
		 l.enque(20); 
		 l.enque(30);
		 l.enque(40);
		 l.deque();
		 l.display();
	 }
	 
 }
 
 
 
 
 
 
 
 
 