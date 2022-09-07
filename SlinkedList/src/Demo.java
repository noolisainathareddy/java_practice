
public class Demo {
	
	static ListNode head;
	
	static class ListNode
	{
		
		int data;
		ListNode next; 
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String[] args)
	{
		
			head=new ListNode(1);
		
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(5);
		
		head.next= second; 
		second.next=third;
		third.next=fourth; 
		
		
	}
}
