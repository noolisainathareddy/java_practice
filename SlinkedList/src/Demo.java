

class ListNode
{
	int data; 
	ListNode next;
	
	public ListNode(int data)
	{
		this.data=data; 
		this.next=null; 
	}
}
public class Demo {
	
	public ListNode head; 

	public static void main(String[] args)
	{
		Demo sll=new Demo();
		
		sll.head = new ListNode(10); 
		ListNode second = new ListNode(20); 
		ListNode third  = new ListNode(30); 
		ListNode fourth = new ListNode(30); 
		ListNode fifth  = new ListNode(50); 
		
		sll.head.next=second; 
		second.next=third; 
		third.next=fourth; 
		fourth.next=fifth; 
		
		ListNode current = sll.head;
		while(current !=null)
		{
			System.out.print(current.data + ",");
			try {
				if(current.data == current.next.data)
				{
					current=current.next;  
					
					
				}
			}
			catch(Exception e)
			{
				//System.out.print("errorr......");
			}
			
			current = current.next; 
		}
		
		System.out.print("null");
		
	}
}
