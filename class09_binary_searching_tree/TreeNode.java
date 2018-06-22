package class9_binary_searching_tree;

public class TreeNode {
	
	private int data;
	private TreeNode left;
	private TreeNode right;
	
	
	TreeNode(){
		this.data=0;
		this.left=null;
		this.right=null;
	}
	
	TreeNode(int x){
		this.data=x;
		this.left=null;
		this.right=null;
	}
	
	TreeNode (int x,TreeNode y,TreeNode z){
		this.data=x;
		this.left=y;
		this.right=z;
	}
	
	public void setData(int x){
		this.data=x;
	}
	
	public int getData(){
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
