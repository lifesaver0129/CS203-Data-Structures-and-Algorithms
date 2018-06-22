package class8_binary_tree;

public class TreeQueue {
	private int mSize;
	private int front;
	private int rear;
	private TreeNode[] queue;

	public TreeQueue(int size) {
		this.mSize = size;
		queue = new TreeNode[size];
		front = 0;
		rear = 0;
	}

	public void BFS_enQueue(TreeNode x){
		if (isFull()) {
			System.out.println("full");
		} else {
			queue[rear] = x;
			rear = (rear + 1) % mSize;
		}		
	}

	public void BFS_print() {
		if (isEmpty()) {
			System.out.println("empty");
		} else {
			int i = front;
			while (i != rear) {
				System.out.print(queue[i].getData() + " ");
				if (queue[i].getLeftChild()!=null){
					BFS_enQueue(queue[i].getLeftChild());
				}
				if(queue[i].getRightChild()!=null){
					BFS_enQueue(queue[i].getRightChild());
				}
				i = (i + 1) % mSize;
			}
			System.out.println();
		}
	}
	

	
	
	
	public TreeNode getFrontValue() {
		if (front == rear) {
			System.out.println("empty");
			return null;
		} else {
			return queue[front];
		}
	}

	public boolean enQueue(TreeNode x) {
		if (isFull()) {
			System.out.println("full");
			return false;
		} else {
			queue[rear] = x;
			rear = (rear + 1) % mSize;
			return true;
		}
	}

	public TreeNode deQueue() {
		if (isEmpty()) {
			System.out.println("empty");
			return null;
		} else {
			TreeNode element = queue[front];
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

}
