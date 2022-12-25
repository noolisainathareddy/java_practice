package binaryTree;

public class treeimp {

	private TreeNode root; 
	
	private class TreeNode
	{
		private int data; 
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data)
		{
			this.data=data; 
		}
	}
	
	public void createBinaryTree()
	{
		TreeNode first=new TreeNode(1); 
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(5);
		TreeNode fourth=new TreeNode(3);
		TreeNode fifth=new TreeNode(4);
		TreeNode sixth=new TreeNode(6);
		root =first; 
	
		first.right=second; 
		second.right=third;;
	     third.left=fourth; 
	     third.right=sixth;
	     fourth.right=fifth;
	}
	
	public void preOrder(TreeNode root)
	{
		if(root == null)
			return; 
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right); 
	}
	
	public static void main(String args[])
	{
		treeimp obj=new treeimp(); 
		
		obj.createBinaryTree(); 
	
		obj.preOrder(obj.root);
	}
}
