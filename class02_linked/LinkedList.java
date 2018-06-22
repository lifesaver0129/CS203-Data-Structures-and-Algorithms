package class2_linked;

public class LinkedList {
	private Node head = null;// 链表头节点
	private Node tail = null;// 链表尾节点
	private Node pointer = null;// 遍历链表的节点
	
	public LinkedList(Node node) {
		head = new Node();
		head.LinkNext(node);
		tail = node;
	}

	public void AddNode(Node node) {
		tail.LinkNext(node);
		tail = tail.next();
	}

	public int getLength() {
		int length = 0;
		pointer = head.next();
		while (pointer != null) {
			length++;
			pointer = pointer.next();
		}
		return length;
	}

	public void printLink() {
		pointer = head.next();
		while (pointer != null) {
			System.out.print(pointer.getValue() + " ");
			pointer = pointer.next();
		}
		System.out.println();
	}

	public void insertAt(int index, Node node) {
		if (index > this.getLength()) {
			System.out.println("wrong");
		} else {
			pointer = head;
			for(int i=0;i<index-1;i++)
			{
				pointer=pointer.next();
			}
			node.LinkNext(pointer.next());
			pointer.LinkNext(node);
		}
	}

	public void removeAt(int index) {
		if (index > this.getLength()) {
			System.out.println("wrong");
		}else{
			pointer=head;
			Node q=pointer;
			for(int i=0;i<index;i++){
				q=pointer;
				pointer=pointer.next();
			}
			q.LinkNext(pointer.next());
			pointer.LinkNext(null);
		}	
	}
    
	public void searchReplace(Object m){
		pointer=head.next();
	    while(pointer!=null){
	    	Object p=pointer.next().getValue();
	    	if(p==m){
	        	pointer.LinkNext(pointer.next().next());
	        	}
	        pointer=pointer.next();
	    }
	}
}

class Node {
	private Object value;// 值
	private Node next;// 下一个节点
	
	public Node() {
	}

	public Node(Object value) {
		this.value = value;
	}

	public Node next() {
		return this.next;
	}

	public void LinkNext(Node next) {
		this.next = next;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return this.value;
	}

}




