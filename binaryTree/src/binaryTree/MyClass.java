package binaryTree;
import java.util.Stack;

//pre-order

public class MyClass {

	TreeNode root; 
	class TreeNode
	{
		int data; 
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data)
		{
			this.data=data;
		}
	}
	
	public void createTree()
	{
		TreeNode f1=new TreeNode(1);
		TreeNode f2=new TreeNode(2);
		TreeNode f3=new TreeNode(3);
		TreeNode f4=new TreeNode(4);
		TreeNode f5=new TreeNode(5);
		TreeNode f6=new TreeNode(6);
		TreeNode f7=new TreeNode(7);
		TreeNode f8=new TreeNode(100);
		root=f1;
		f1.left=f2;
		f1.right=f3;
		f2.left=f4;
		f4.right=f8;
		f2.right=f5;
		f3.left=f6;
		f3.right=f7; 
	}
	
	void preorder(TreeNode root)
	{
		
		Stack<TreeNode> stack=new Stack<>();
		System.out.println("came here");
		
		stack.push(root);
		
		while(!stack.isEmpty())
		{
			TreeNode curr=stack.pop();
			System.out.print(curr.data + " ");
			if(curr.right!=null)
			{
				stack.push(curr.right);
			}
			
			if(curr.left!=null)
			{
				stack.push(curr.left); 
			}
				
		}
		
	}
	
	
	public static void main(String[] args)
	{
		MyClass obj=new MyClass();
		obj.createTree();
		obj.preorder(obj.root);
	}
}
