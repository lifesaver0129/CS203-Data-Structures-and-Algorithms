package class7_DLinked;

public class DLinkedList {
	Node head = null;
	Node tail = null;
	int count = 0;
	
	public DLinkedList(){
		this.head=null;
		this.tail=null;
		this.count=0;
		head=tail;
	}
	
	public DLinkedList(Node head,Node tail,int count){
		this.head=null;
		this.tail=null;
		this.count=0;
		head=tail;
	}

	public void add(Node node){
		if(head==null){
			head=node;
			head.setFront(tail);
			tail=node;
			tail.setNext(head);
		}
		else{
			tail.setNext(node);
			node.setFront(tail);
			tail=node;
			tail.setNext(head);
		}
		count++;
	}
	
	public void addHeadData(int data){
		Node node =new Node(data);
		if(head==null&&tail==null){
			head=node;
			head.setFront(tail);
			tail=node;
			tail.setNext(head);
		}
		else{
			head.setFront(node);
			node.setNext(head);
			head=node;
			head.setFront(tail);
		}
		count++;
	}
	
	public void addTailData(int data){
		Node node =new Node(data);
		if(head==null&&tail==null){
			head=node;
			head.setFront(tail);
			tail=node;
			tail.setNext(head);
		}
		else{
			tail.setNext(node);
			node.setFront(tail);
			tail=node;
			tail.setNext(head);
		}
		count++;
	}
	
	public void insertAt(int data,Node key){
		Node node =new Node(data);
		if(head!=null){
			Node temp=head;
			while (temp!=tail&&temp!=key){
				temp=temp.next;
			}
			if(temp==key){
				node.setFront(temp.getFront());
				node.setNext(temp);
				temp.front.setNext(node);
				temp.setFront(node);
				count++;
				if(temp==head){
					head=node;
				}
			}
			else{
				System.out.println("Not found!");
			}
		}
		else{
			System.out.println("List is empty!");
		}
	}
	
	public void findNode(int data){  
        Node temp=head; 
        int m=1;
        if(head!=null){  
            while(temp!=tail){  
                if(temp.getData()==data){  
                	System.out.println("Position:"+m);
                	break;
                }  
                temp=temp.getNext();  
                m++;
            }  
            if(temp.getData()!=data){
            	System.out.println("Not found!");
            }
            else{
            	System.out.println("Position:"+ m);
            }
        }    
    }  
	
	public void delete(Node node){
		if(head!=null){
			Node temp=head;
			while(temp!=node&&temp!=tail){
				temp=temp.next;
			}
			if(temp==node){
				temp.getFront().setNext(temp.getNext());
				temp.getNext().setFront(temp.getFront());
				temp.setNext(null);
				temp.setFront(null);
			}
			else{
				System.out.println("Node not found!");
			}
		}else
		System.out.println("List is Empty!");
	}
	
	public void printList(){
		if(head!=null){
			Node temp=head;
				while(temp!=tail){
					System.out.print(temp.getData()+" ");
					temp=temp.next;
				}
				System.out.println(temp.getData());
		}else
			System.out.println("List is Empty!");
	}
	
}

