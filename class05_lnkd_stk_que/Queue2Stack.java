package class5_lnkd_stk_que;

public class Queue2Stack {
	Queue qu1 = new Queue();
	Queue qu2 = new Queue();
	
/*	入栈：如果两个队列都为空，则将元素压到队列qu1；
 * 		否则将元素依次压入到非空的队列中 */
	public void push(char c){
		if(qu1.isEmpty() && qu2.isEmpty())
			qu1.enQueue(c);
		else if(!qu1.isEmpty() && qu2.isEmpty())
			qu1.enQueue(c);
		else if(qu1.isEmpty() && !qu2.isEmpty())
			qu2.enQueue(c);
	}
	
/*	出栈：1、如果队列1非空，则把队列1的前size-1个元素依次出队列再进入队列2，然后把队列1的第size个元素出队列作为栈顶元素。
 * 		2、如果队列2非空，则把队列2的前size-1个元素依次出队列再进入队列1，然后把队列2的第size个元素出队列作为栈顶元素。*/ 
	public char pop(){
		if(qu1.isEmpty() && qu2.isEmpty()){
			System.out.println("Stack is empty");
			return '0';
		}
		if(!qu1.isEmpty()){
			int size = qu1.size();
			for(int i = 0; i <= size-1; i++){
				qu2.enQueue(qu1.deQueue());
			}
			return qu1.deQueue();
		} else {
			int size = qu2.size();
			for(int i = 0; i <= size-1; i++){
				qu1.enQueue(qu2.deQueue());
			}
			return qu2.deQueue();
		}
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
