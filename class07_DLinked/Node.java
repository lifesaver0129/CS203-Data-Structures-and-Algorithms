package class7_DLinked;

public class Node {
	public int data;
	public Node front;
	public Node next;
	
	public Node(){
	}
	
	public Node(int data){
		this.data=data;
	}
	
	public Node(int data,Node front,Node next){
		this.data=data;
		this.front=front;
		this.next=next;
	}

	public void setData(int data){
		this.data=data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setFront(Node front){
		this.front=front;
	}

	public Node getFront(){
		return this.front;
	}
	
	public void setNext(Node next){
		this.next=next;
	}

	public Node getNext(){
		return this.next;
	}
	
}
