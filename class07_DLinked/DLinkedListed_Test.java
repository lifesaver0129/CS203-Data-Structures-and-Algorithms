package class7_DLinked;

public class DLinkedListed_Test {

	public static void main(String[] args){
		Node n1=new Node(1);
		Node n2=new Node(2);
	    Node n3=new Node(3);
	    Node n4=new Node(4);
	    Node n5=new Node(5);
	    
	    DLinkedList list=new DLinkedList();
	    list.add(n1);
	    list.add(n2);
	    list.add(n3);
	    list.printList();
	   // list.delete(n1);
	    list.addHeadData(6);
	    list.printList();
	    list.addTailData(7);
	    list.printList();
	    list.add(n4);
	    list.printList();
	    list.insertAt(0, n2);
	    list.printList();
	    list.findNode(5);
	    list.findNode(4);
	    list.add(n5);
	    list.printList();
	    list.findNode(5);
	    list.insertAt(8, n3);
	    list.printList();
	    list.delete(n1);
	    list.printList();
	    
	}

}
