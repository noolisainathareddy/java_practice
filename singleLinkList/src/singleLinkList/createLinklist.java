package singleLinkList;

public class createLinklist {

	ListNode head; 
	static class  ListNode
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
		createLinklist sll=new createLinklist(); 
		sll.head=new ListNode(10);
		ListNode second= new ListNode(1); 
		ListNode third= new ListNode(8);
		ListNode fourth= new ListNode(11);
		
		sll.head.next=second; 
		second.next=third;
		third.next=fourth; 
	 
	
		
			ListNode curr = sll.head; 
			
			while(curr !=null)
			{
				System.out.print(curr.data + " ");
				curr=curr.next; 
				
			}
			
		}
		
}

