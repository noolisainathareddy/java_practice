package binaryTree;
import java.util.Stack;

//Inorder

public class part4 {

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
		//TreeNode f8=new TreeNode(100);
		
		root=f1;
		f1.left=f2;
		f1.right=f3;
		f2.left=f4;
		//f4.right=f8;
		f2.right=f5;
		f3.left=f6;
		f3.right=f7; 
	}
	
	void inOrder(TreeNode root)
	{
		Stack<TreeNode> stack=new Stack<>(); 
		TreeNode temp=root; 
		while(!stack.isEmpty() || temp!=null)
		{
			if(temp!=null)
			{
				stack.push(temp);
				temp=temp.left;
			}
			else
			{
				temp=stack.pop(); 
				System.out.print(temp.data + " ");
				temp=temp.right; 
			}
			
		}
		
	}
	
	
	public static void main(String[] args)
	{
		part4 obj=new part4();
		obj.createTree();
		obj.inOrder(obj.root);
	}
}

