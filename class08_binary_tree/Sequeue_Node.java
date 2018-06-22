package course4;

import course8.Node;

public class Sequeue_Node {
	private int mSize;
	private int front;
	private int rear;
	private Node[] queue;

	public Sequeue_Node(int size) {
		this.mSize = size;
		queue = new Node[size];
		front = 0;
		rear = 0;
	}

	public Node getFrontValue() {
		if (front == rear) {
			System.out.println("empty");
			return null;
		} else {
			return queue[front];
		}
	}


	public boolean enQueue(Node x) {
		if (isFull()) {
			System.out.println("full");
			return false;
		} else {
			queue[rear] = x;
			rear = (rear + 1) % mSize;
			return true;
		}
	}


	public Node deQueue() {
		if (isEmpty()) {
			System.out.println("empty");
			return null;
		} else {
			Node element = queue[front];
			front = (front + 1) % mSize;
			return element;
		}
	}

	public int length() {
		return (mSize + rear - front) % mSize;
	}


	public int getFront() {
		return front;
	}

	public int getRear() {
		return rear;
	}

	
	public boolean isEmpty() {
		if (rear == front) {
			return true;
		} else {
			return false;
		}
	}

	
	public boolean isFull() {
		if ((rear + 1) % mSize == front) {
			return true;
		} else {
			return false;
		}
	}

	
	public void printQueue() {
		if (isEmpty()) {
			System.out.println("empty");
		} else {
			int i = front;
			while (i != rear) {
				System.out.print(queue[i].getData() + " ");
				i = (i + 1) % mSize;
			}
			System.out.println();
		}
	}
}
