package class3_stack;

public class Stack_Int{
	
	protected int capacity;//数组的实际容量
	protected int[] S;//对象数组
	protected int top = -1;//栈顶元素的位置
	
	//随意创建栈对象
	public Stack_Int() {
		this(50);
	}
	
	//按指定容量创建栈对象
	public Stack_Int(int cap) {
		capacity = cap;
		S = new int[capacity]; 
	}
	
	//测试栈是否为空
	public boolean isEmpty(){
		return (top < 0); 
	}
	
	//入栈
	public void push(int obj) {
	S[this.top+1]=obj;
	top++;
	}		
	
	//取栈顶元素
	public int top(){
		if(this.top!=-1){
			int t=S[top];
			return t;
		}
		else{
			System.out.print("This stack is empty");
			return 0;
		}
		
	}
	//出栈
	public int pop() {
		if(this.top!=-1){
			int t=S[top];
			S[top]=0;
			top--;
			return t;
		}
		else{
			System.out.print("This stack is empty");
			return 0;
		} 
	} 	
	
	public Object peek(){
		Object result;
		if(isEmpty())
			result=null;
		else
			result=S[top];
		return result;
	}
}


