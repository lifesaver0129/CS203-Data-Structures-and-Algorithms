package pre_in_post_order_traversal;

public class TreeNode {
	
	private TreeNode left;
	private TreeNode right;
	private char data;
	
	TreeNode(){
		this.data=0;
		this.left=null;
		this.right=null;
	}
	
	TreeNode(char x){
		this.data=x;
		this.left=null;
		this.right=null;
	}

	TreeNode(char x,TreeNode y){
		this.data=x;
		this.left=y;
		this.right=null;
	}
	
	TreeNode (char x,TreeNode y,TreeNode z){
		this.data=x;
		this.left=y;
		this.right=z;
	}
	
	public void setData(char x){
		this.data=x;
	}
	
	public char getData(){
		return this.data;
	}
	
	public void setLeft(TreeNode x){
		this.left=x;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}
	
	public void setRight(TreeNode x){
		this.right=x;
	}
	
	public TreeNode getRight(){
		return this.right;
	}
}
