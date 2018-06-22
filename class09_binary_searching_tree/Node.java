package course9;

public class Node {
	private int value;
	private Node leftChild;
	private Node rightChild;
	
	public Node(int value) {
		this.value=value;
	}
	public Node(){}
	public Node(int value,Node l,Node r){
		this.value=value;
		this.leftChild=l;
		this.rightChild=r;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
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
