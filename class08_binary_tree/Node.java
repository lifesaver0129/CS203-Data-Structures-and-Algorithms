package course8;

public class Node {
	private char data;
	private Node leftChild;
	private Node rightChild;
	
	public Node(char newData){
		leftChild=null;
		rightChild=null;
		data=newData;
	}
	
	public Node(char newData,Node leftChild,Node rightChild){
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

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
}
