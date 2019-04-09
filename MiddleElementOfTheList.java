
/* Program to find middle element of the LinkedList  */



import java.util.Scanner; 
public class linked
{
	Nodes first;  // head node of entire list 
	  
    
    class Nodes 
    { 
        int data; 
        Nodes next; 
        Nodes(int d) 
        {
        	data = d; 
        	next = null; 
        } 
    } 
	 public void appendlist(int new_data) 
	    { 
	        Nodes new_node = new Nodes(new_data); 
	  
	        
	        if (first == null) 
	        { 
	            first = new Nodes(new_data); 
	            return ; 
	        } 
	  
	        
	        new_node.next = null; 
	  
	        
	        Nodes last = first; 
	        while (last.next != null) 
	            last = last.next; 
	        last.next = new_node; 
	     
	        return ; 
	    } 
	 public void displaylist(int mid) 
	 { 
	        Nodes temp = first;
	        int count=0;
	        while (temp != null)

	        { 
	        	count++;
	        	if(count==mid)
	        	{
	        		System.out.print(temp.data); 
	        		break;	        	
	        	}
	            temp = temp.next;
	        } 
	  } 
	 

	public static void main(String[] args) 
	{	
		
			linked middle=new linked();
		   	Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
			int mid=0;
		        for(long i=0;i<n;i++)
		        {
		        	int a=sc.nextInt();
		        	middle.appendlist(a);
		        }
		        mid=n/2+1;
		        System.out.print("middle element in the list is" + mid); 
		        middle.displaylist(mid);
		        
		        sc.close();	        
	}
	

}