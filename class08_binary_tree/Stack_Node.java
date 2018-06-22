package course33;
import course8.Node;

public class Stack_Node {
	private int capacity;
	private Node[] S;
	private int top = -1;

	public Stack_Node(int cap) {
		capacity = cap;
		S = new Node[capacity];
	}

	public int getSize() {
		return top + 1;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void push(Node obj)  {
		if (getSize() == capacity) {
			System.out.println("overFlow");
		}
		S[++top] = obj;
	}

	public Node top() {
		if (isEmpty()) {
			System.out.println("empty");
			return null;
		} else {
			return S[top];
		}
	}

	public Node pop() {
		Node elem;
		if (isEmpty()) {
			System.out.println("empty");
			return null;
		}
		elem = S[top];
		top--;
		return elem;
	}

	public void print()  {
		if (isEmpty()) {
			System.out.println("empty");
		} else {
			for (int i = 0; i < this.getSize(); i++) {
				System.out.print(S[i]+" ");
			}
			System.out.println();
		}
	}
	
	public void MysteryWrite(int Last,int Current){
		if(Current<100){
			System.out.print(Current);
			int Temp=Current+Last;
			MysteryWrite(Current,Temp);
		}
	}
}
