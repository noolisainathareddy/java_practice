package bTree;
import java.util.Stack;
public class preOrder {

	TreeNode root; 
	class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right; 
		
		TreeNode(int data)
		{
			this.data=data;
		}
	}
		public void createTreeNode()
		{
			TreeNode first=new TreeNode(1);
			TreeNode second=new TreeNode(2);
			TreeNode third=new TreeNode(3);
			TreeNode fourth=new TreeNode(4);
			TreeNode fifth=new TreeNode(5);
			TreeNode sixth=new TreeNode(6);
			TreeNode seventh=new TreeNode(7);
			
			root=first;
			first.left=second;
			first.right=third; 
			second.left=fourth;
			second.right=fifth;
			third.left=sixth;
			third.right=seventh;
			
		}
		
		void preOrderlist(TreeNode root)
		{
			Stack<TreeNode> stack=new Stack<>(); 
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
		preOrder obj=new preOrder(); 
		obj.createTreeNode();
		obj.preOrderlist(obj.root);
		
	}
}
