package class5_lnkd_stk_que;

public class Stack_Int {

	public static final int CAPACITY = 1024;//数组的默认容量
	private int capacity;//数组的实际容量
	private int[] S;//对象数组
	private int top = -1;//栈顶元素的位置

//按默认容量创建栈对象
	public Stack_Int()
	{	this(CAPACITY);	}

//按指定容量创建栈对象
	public Stack_Int(int cap) {
		capacity = cap;
		S = new int[capacity];
	}

//获取栈当前的规模
	public int getSize()
	{	return (top + 1);	}

//测试栈是否为空
	public boolean isEmpty()
	{	return (top < 0);	}

//入栈
	public void push(int obj) throws ExceptionStackFull {
		if (getSize() == capacity)
			throw new ExceptionStackFull("意外：栈溢出");
		S[++top] = obj;
		
/*		top = top + 1;
		S[top] = obj;*/
		
	}
	
//取栈顶元素
	public int top() throws ExceptionStackEmpty {
		if (isEmpty())
			throw new ExceptionStackEmpty("意外：栈空");
		return S[top];
	}

//出栈
	public int pop() throws ExceptionStackEmpty {
		int elem;
		if (isEmpty())
			throw new ExceptionStackEmpty("意外：栈空");
		elem = S[top];
		top--;
		//System.out.print(elem);

		return elem;
		
	}
	
	public void printStack(){
		for (int i = 0; i <= top; i++){
			System.out.print(S[i]);
		}
		System.out.println();
	}
	
	public static void main(String [] args){
		Stack_Int sk = new Stack_Int(10);
		sk.push('1');
		sk.push('2');
		sk.push('3');
		
		sk.printStack();
		
		System.out.println(sk.pop());
		System.out.println(sk.pop());
		System.out.println(sk.pop());
	}

	public void push(Object ele) {
		// TODO Auto-generated method stub
		
	}
}
