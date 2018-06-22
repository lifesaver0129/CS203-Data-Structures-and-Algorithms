package class3_stack;

public class Stack_Int_Test {

	public static void main(String[] args){
	Stack_Int stack233= new Stack_Int();
	System.out.println(stack233.isEmpty());
	stack233.push(4);
	stack233.push(2);
	System.out.println(stack233.top());
	stack233.push(6);
	stack233.push(3);
	System.out.println(stack233.top());
	System.out.println(stack233.pop());
	System.out.println(stack233.top());
}
}
