package binaryTree;
import java.util.Stack; 

public class sumOfLeftLeaves {

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
	
	void createTree()
	{
		TreeNode f1=new TreeNode(3);
		TreeNode f2=new TreeNode(9);
		TreeNode f3=new TreeNode(1);
		//TreeNode f4=new TreeNode(15);
		//TreeNode f5=new TreeNode(7);
		TreeNode f6=new TreeNode(10);
		
		root=f1;
		f1.left=f2;
		f2.left=f6;
		f2.right=f3;
		//f3.left=f5; 
		//f1.right=f3;
		//f3.left=f4; 
		//f3.right=f5;	
	}
	
	void leftLeavesSum(TreeNode root)
	{
		Stack<TreeNode> stack=new Stack<>(); 
		TreeNode temp=root; 
		int sum=0;
		
		
		while(temp !=null || !stack.empty())
		{
		
			if(temp!=null)
			{
				stack.push(temp);
				System.out.println("temp :" + temp.data);
				temp=temp.left; 
					
			}
			else
			{
				temp=stack.peek();
				temp=temp.right;
				while(temp==null && !stack.empty())
				{
					temp=stack.pop(); 
					sum = sum + temp.data; 
					System.out.println("sum : " + sum);
					temp=stack.peek();
					temp=temp.right; 
				}
				
		
			}
			
		}
		
		
	}
	
	public static void main(String[] args)
	{
		sumOfLeftLeaves obj=new sumOfLeftLeaves();
		obj.createTree();
		obj.leftLeavesSum(obj.root);
	}
	
}
