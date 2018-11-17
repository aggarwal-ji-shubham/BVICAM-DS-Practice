import java.util.Scanner;
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

class Node
{
    protected int data;
    protected Node link;
 
    // default Constructor  
    public Node()
    {
        link = null;
        data = 0;
    }    
    //paremeterised  Constructor  
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }    
    //  set link to next Node  
    public void setLink(Node n)
    {
        link = n;
    }    
    //  set data to current Node  
    public void setData(int d)
    {
        data = d;
    }    
    //  get link to next node  
    public Node getLink()
    {
        return link;
    }    
    // get data from current Node  
    public int getData()
    {
        return data;
    }
}
 
// Class linkedStack  
class linkedStack
{
    protected Node top ;
    protected int size ;
 
    // Constructor  
    public linkedStack()
    {
        top = null;
        size = 0;
    }    
    //  Function to check if stack is empty 
    public boolean isEmpty()
    {
        return top == null;
    }    
    //  Function to get the size of the stack 
    public int getSize()
    {
        return size;
    }    
   // push an element to the stack 
    public void push(int data)
    {
        Node nptr = new Node (data, null);
        if (top == null)
            top = nptr;
        else
        {
            nptr.setLink(top);
            top = nptr;
        }
        size++ ;
    }    
    // Function to pop an element from the stack 
    public int pop()
    {
        if (isEmpty() )
       System.out.println("e=underflow");    
	   // throw new NoSuchElementException("Underflow Exception") ;
        Node ptr = top;
        top = ptr.getLink();
        size-- ;
        return ptr.getData();
    }    
    //  Function to check the top element of the stack 
    public int peek()
    {
        if (isEmpty() )
       System.out.println("e=underflow");    
   
        return top.getData();
    }    
    //  Function to display the status of the stack 
    public void display()
    {
        System.out.print("\nStack = ");
        if (size == 0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = top;
        while (ptr != null)
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();        
    }
}
 
// Class LinkedStackImplement 
 class Linklist
{    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);   
        // Creating object of class linkedStack  
        linkedStack ls = new linkedStack();          
        // Perform Stack Operations 
        System.out.println("Linked Stack Test\n");  
        char ch;     
        do 
        {
            System.out.println("\nLinked Stack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");            
            int choice = scan.nextInt();
            switch (choice) 
            {
            case 1 :
                System.out.println("Enter integer element to push");
                ls.push( scan.nextInt() ); 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = "+ ls.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+ ls.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = "+ ls.isEmpty());
                break;                
            case 5 : 
                System.out.println("Size = "+ ls.getSize()); 
                break;                
            case 6 : 
                System.out.println("Stack = "); 
                ls.display();
                break;                        
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }           
            // display stack 
            ls.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);       
 
        } while (ch == 'Y'|| ch == 'y');                 
    }
}