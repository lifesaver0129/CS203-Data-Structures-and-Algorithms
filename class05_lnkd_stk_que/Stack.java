package class5_lnkd_stk_que;


public class Stack {

	private Node top; 	//栈顶引用
	private int size;	//栈中元素个数 
	
	public Stack(){
		top = null;
		size = 0;
	}

	//入栈
	public void push(char data){
		Node node = new Node(data,null);
		node.setNext(top);
		top = node;
		size++;
		
	}
	
	//出栈
	public char pop(){
		if(top == null){
			System.out.println("Stack is empty");
			return '0';
		}else{
			char d = top.getData();
			top = top.getNext();
			size--;
			return d;
		}
	}
	
	//取栈顶元素
	public char top(){
		if(top == null){
			System.out.println("Stack is empty");
			return '0';
		}else{
			char d = top.getData();
			return d;
		}
	}
	
	//返回栈中元素个数
	public int size(){
		return size;
	}
	
	//判断栈是否为空
	public boolean isEmpty(){
		if(top == null)
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		Stack sk = new Stack();
		sk.push('a');
		sk.push('b');
		sk.push('c');
		
		System.out.println(sk.pop());
		System.out.println(sk.pop());
		System.out.println(sk.pop());
	}

}

class Node {
	private char value;// 值
	private Node next;// 下一个节点
	
	public Node() {
	}

	public Node(char value, Object object) {
		this.value = value;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setData(char value) {
		this.value = value;
	}

	public char getData() {
		return this.value;
	}

}
