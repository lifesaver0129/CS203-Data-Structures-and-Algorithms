package class3_stack;

public class Postfix_Expression {

	
		private static String list  []=new String[100];//充当列表的数组
		private static String stack1[]=new String[100];//充当栈的数组1
		private static String stack2[]=new String[100];//充当栈的数组2
		static Postfix_Expression ms = new Postfix_Expression();   //当前对象的引用
		public int properties(String s)
		{
			if(s.equals("+")||s.equals("-")) return 1;
			if(s.equals("*")||s.equals("/")||s.equals("%")) return 2;
			return 0;//如果是"("的时候 返回0
		}
		public void push(String c,String stack[])//所要插入的字符串,被插入的栈
		{
			//因为用不定长度的数组模拟栈 所以首先计算这个数组中已经存在多少个元素
			int i=0;
			while(stack[i]!=null)
			{
				i++;
			}
			//已经存在i个元素  但第i个元素在数组中的下标是i-1 
			stack[i]=c;
			System.out.println(c+" 进栈");
		}
		public String pop(String stack[])
		{
			int i=0;
			if(stack[0]!=null)
			{
				while(stack[i]!=null)
				{
					i++;
				}
				i--;
				String temp = stack[i];
				stack[i] = null;
				System.out.println(temp+" 出栈");
				return temp;	
			}
			return null;
			
		}
		public String seek(String stack[])
		{
			int i=0;
			if(stack[0]!=null)
			{
				
				while(stack[i]!=null)
				{
					i++;
				}
				i--;	
			}
			return stack[i];
		}
		public String[] yusu(String s)// 分析语速的同时将中缀变后缀
		{
			
			@SuppressWarnings("unused")
			String temps[] = new String[100];
			int j=0;//记录数组第一个空元素
			int k=0;//记录上一个操作符的位置
			for(int i=0;i<s.length();i++)
			{

				if((s.charAt(i)<'0'||s.charAt(i)>'9')&&s.charAt(i)!='.')//如果不是数字或小数点 换句话说 就是+-*/%()中的一个
				{
					if(s.substring(k,i).length()!=0)//如果截取的字符长度不为0
					{
						list[j]=s.substring(k,i);
						j++;
						System.out.println("数字"+s.substring(k,i)+"进列表");
					}
					if(stack1[0]==null)//若栈底为空 则栈空  则直接把字符压入栈
					{
						System.out.println("栈中第一个元素 :");
						ms.push(s.charAt(i)+"",stack1);//符号放入栈里
					}else
					if(s.charAt(i)=='(')//若是"("符号，则直接入栈 并设置其优先级最低
					{
						ms.push("(",stack1);
					}else
					if(s.charAt(i)==')')//如果字符是个")"，在遇见"("前，弹出所有操作符，然后把它们添加到list 
					{
						System.out.println(") 出现");
						while(!ms.seek(stack1).equals("("))
						{
							list[j]=ms.pop(stack1);
							j++;
						}      
						
					}else
					if(ms.properties(s.charAt(i)+"")>ms.properties(ms.seek(stack1)))//剩下的情况只有+-*/和%了  如果优先级比栈顶元素的高则入栈
					{
						ms.push(s.charAt(i)+"",stack1);
					}else//优先级小的则栈顶元素出栈进入list  一直到比栈顶优先级大为止 然后它再进栈
					{
						System.out.println("低级符号等待");
						while(ms.properties(s.charAt(i)+"")<=ms.properties(ms.seek(stack1)))
						{
							list[j]=ms.pop(stack1);
							j++;
							if(stack1[0]==null) break;
						}
						System.out.println("低级符号等待结束");
						ms.push(s.charAt(i)+"",stack1);
					}
					k=i+1;//记录下当前操作符在字符串中的位置
				}
			}
			//把最后一个数放到list里面
			String temp = s.substring(k); //临时的字符串用来存放最后一个数 及后面可能有的")"
			String ss = "";
			for(int i=0;i<temp.length();i++)
			{
				ss=temp.charAt(i)+"";
				if(ss.equals(")"))
				{
						list[j]=temp.substring(0,i);
						j++;
						break;
				}
				if(i==temp.length()-1)
				{
					list[j]=temp.substring(i);
						j++;
				}
			}
			//最后一个数也放到list后 则把栈中剩余的操作符全部放入list中
			while(ms.seek(stack1)!=null)
			{
				list[j]=ms.pop(stack1);
				j++;
			}
			
			return list;
			
		}
		public double compute(double n,double m,String symbol)
		{
			double result = 0;
			if(symbol.equals("+"))
			{
				result = n+m;
			}else
			if(symbol.equals("-"))
			{
				result = n-m;
			}else
			if(symbol.equals("*"))
			{
				result = n*m;
			}else
			if(symbol.equals("/"))
			{
				result = n/m;
			}else
			result = n%m;
			
			return result;
		}
		public String calculate(String s1[])
		{
			String result = "";
			int a=0;
			while(s1[a]!=null)
			{
				a++;
			}
			for(int i=0;i<a;i++)
			{
				if(!s1[i].equals("("))//左括号不参与结果计算
				{
					if(s1[i].equals("+")||s1[i].equals("-")||s1[i].equals("*")||s1[i].equals("/")||s1[i].equals("%"))//如果不是数 则执行响应操作
					{
						double m =Double.parseDouble(ms.pop(stack2));
						double n =Double.parseDouble(ms.pop(stack2));
						String temp = ms.compute(n,m,s1[i]) + "";
						ms.push(temp,stack2);
						
					}else//如果是个数则放入栈
					{
						ms.push(s1[i],stack2);
					}
				}
			}
			//执行完毕后 栈中有且只有一个字符串  也就是结果
			result = stack2[0];
			return result;
		}
		public static void main(String[] args)
		{
			
			String s = "(3.5)+5*7-(4+6)*2";//3.5 5 7 * + 4 6 + 2 * ( - (
			System.out.println("原式为:"+s);
			System.out.print("中缀表达式向后缀表达式转换  :");
			
			//先转化语速  and  转换到后缀表达式
			String s1[] = ms.yusu(s);
			
			System.out.print("转换后的后缀表达式是  :");
			for(int i=0;i<s1.length;i++)
			{
				if(s1[i]==null) break;
				System.out.print(s1[i]+" ");
			}
			
			System.out.println();
			String result = ms.calculate(s1);//用后缀表达式计算结果
			System.out.println("结果是:  "+result);//输出结果
			System.out.println();
		}
	}

	
