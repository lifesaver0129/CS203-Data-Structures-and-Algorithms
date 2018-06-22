package class5_lnkd_stk_que;

public class Queue {
	private Node front;	//队头引用
	private Node rear;	//队尾引用
	
	//构造方法，队列初始化为空队列
	public Queue(){
		front = rear = null;
	}

	//入队
	public void enQueue(char data){
		Node node = new Node(data,null);
		if(front == null){
			front = node;
			rear = node;
		}else{
			rear.setNext(node);
			rear = node;
		}
	}
	
	//出队
	public char  deQueue(){
		if(front == null){
			System.out.println("Queue is empty");
			return '0';
		}else if (front == rear){
			char d = front.getData();
			front = null;
			rear = null;
			return d;
		}else{
			char d = front.getData();
			front = front.getNext();
			return d;
		}
	}

	//取队头元素
	public char  getHead(){
		if(front == null){
			System.out.println("Queue is empty");
			return '0';
		}else{
			char d = front.getData();
			return d;
		}
	}
	
	//判断队列是否为空
	public boolean isEmpty(){
		if(front == null)
			return true;
		else
			return false;
	}
	
	//返回队列中元素个数
	public int size(){
		int s = 0;
		for(Node no = front; no != rear; no = no.getNext())
			s++;
		s++;
		return s;
	}
	
	
	public static void main(String[] args) {
		Queue qu = new Queue();
		qu.enQueue('a');
		qu.enQueue('b');
		qu.enQueue('c');
		
		System.out.println(qu.size());

		
		System.out.println(qu.deQueue());
		System.out.println(qu.deQueue());
		System.out.println(qu.deQueue());

	}
}
