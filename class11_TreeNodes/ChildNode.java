package class92_TreeNodes;

public class ChildNode {

	private int child;
	private ChildNode next;
	
	public ChildNode(){
	}
	
	public ChildNode(int a){
		this.child=a;
	}
	
	public ChildNode(int a, ChildNode b){
		this.child=a;
		this.next=b;
	}
	
	public void setData(int a){
		this.child=a;
	}
	
	public int getData(){
		return this.child;
	}
	
	public void setNext(ChildNode a){
		this.next=a;
	}

	public ChildNode getNext(){
		return this.next;
	}

}