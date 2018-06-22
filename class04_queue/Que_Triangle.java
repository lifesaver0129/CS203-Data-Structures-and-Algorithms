package class4_queue;

public class Que_Triangle {
	public static void main(String[] args) {
		Triangle2(3);
		Triangle(4);
	}

	//do not use "0"
	public static void Triangle2(int n) {
		Queue q = new Queue(n + 3);
		int count = 0;
		q.enQueue(1);
		q.enQueue(1);
	
		while (count < n) {
			for (int i = n - 1; i > count; i--) {
				System.out.print(" ");
			}
			q.printQueue();
			if(n==1){
				return;
			}
			do {
				q.enQueue(q.deQueue() + q.getFrontValue());
			} while (q.getFrontValue() != 1);
			q.enQueue(1);
			count++;
		}

	}
	//using "0"
	public static void Triangle(int n) {
		Queue q = new Queue(n + 3);
		q.enQueue(0);
		q.enQueue(1);
		int count = 0;

		while (count < n) {
			q.enQueue(0);
			int num1 = 0;
			int num2 = 0;
			for (int i = n; i > count; i--) {
				System.out.print(" ");
			}

			do {
				num1 = q.deQueue();
				num2 = q.getFrontValue();
				q.enQueue(num1 + num2);
				System.out.print(num1 + num2 + " ");
			} while (num2 != 0);
			System.out.println();
			count++;
		}
	}

}
