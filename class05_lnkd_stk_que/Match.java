package class5_lnkd_stk_que;

public class Match {
	
	Stack sk = new Stack();
	
	/*	算法思路：
	 *  从左到右处理字符串中的每一个字符
	 *	1、遇到 '(' 或 '[' 或 '{'，则入栈
	 *	2、遇到 ')' 或 ']' 或 ’}'，则栈顶符号出栈，判断是否匹配，如果匹配则继续扫描下一个符号，如果不匹配，报错。*/
		public boolean match(String str){
			for(int i= 0; i < str.length(); i++){
				char c = str.charAt(i);
				if(c == '(' || c == '[' || c == '{')
					sk.push(c);
				if(c == ')'){
					char d = sk.pop();
					if(d != '(')
						return false;
				}
				if(c == ']'){
					char d = sk.pop();
					if(d != '[')
						return false;
				}
				if(c == '}'){
					char d = sk.pop();
					if(d != '{')
						return false;
				}
			}
			return true;
		}
		
		public static void main(String[] args) {
			Match mc = new Match();
//			String str = "3+{4*[5/(2+4)]}";
//			String str = "8*(7+5)-[6-(3*4)]"; 
			String str = "(8*7+5)-{[6-(3*4)}]"; 
			if(mc.match(str))
				System.out.println("Match");
			else
				System.out.println("Not Match");

		

	}

}
