package class5_lnkd_stk_que;

public class Stack2Queue {
	Stack sk1 = new Stack();
	Stack sk2 = new Stack();
	
/*	入队方法：入队元素直接进如栈sk1 */
	public void enQueue(char c){
		sk1.push(c);
	}
	
/*	出队方法：
 *  1、先判栈sk2是否有元素，如果有元素，就直接弹出sk2栈顶元素作为队首元素出队列：
 *  2、如果栈sk2没有元素，则将栈sk1的元素顺序弹出并进栈sk2，然后弹出栈sk2的
 *     栈顶元素作为队首元素出队列 */
	public char deQueue(){
		if(!sk2.isEmpty())
			return sk2.pop();
		else{
			if(sk1.isEmpty()){
				System.out.println("Queue Empty");
				return '0';				
			}else{
				while(!sk1.isEmpty()){
					char d = sk1.pop();
					sk2.push(d);
				}
				return sk2.pop();
			}

		}
	}
	
	
	public static void main(String[] args) {
		Stack2Queue qu = new Stack2Queue();
		qu.enQueue('a');
		qu.enQueue('b');
		qu.enQueue('c');
		
		System.out.println(qu.deQueue());
		System.out.println(qu.deQueue());
		System.out.println(qu.deQueue());


	}

}
