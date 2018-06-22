package class8_binary_tree;

public class TreeNode {
	private char data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public TreeNode(char newData){
		leftChild=null;
		rightChild=null;
		data=newData;
	}
	
	public TreeNode(char newData,TreeNode leftChild){
		this.data=newData;
		this.leftChild=leftChild;
		this.rightChild=null;
	}
	
	public TreeNode(char newData,TreeNode leftChild,TreeNode rightChild){
		this.data=newData;
		this.leftChild=leftChild;
		this.rightChild=rightChild;
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
}
