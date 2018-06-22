package class5_lnkd_stk_que;

public class Compute {

	/* 递归方法*/
	public int recurCompute(int n){
		if(n == 0)
			return 1;
		else if(n == 1)
			return 2;
		else 
			return 2 * recurCompute(n-1) + 2*(n-1)*recurCompute(n-2);
	}

/*  非递归方法
 * 	基本思路：	如果n=0,或n=1，则直接返回结果；
 * 		          如果n>1,则将n,n-1,...2依次入栈，再依次出栈进行计算*/
	public int NonRecurCompute(int n){
		Stack_Int sk = new Stack_Int();
		int e,t;
		int f1 = 1;
		int f2 = 2;
		if (n == 0)
			return 1;
		if (n == 1)
			return 0;
		for(int i = n; i >=2; i--){
			sk.push(i);
		}
		while(!sk.isEmpty()){
			e = sk.pop();
			t =  2*f2+ 2*(e-1)*f1;
			f1 = f2;
			f2 = t;
		}
		return f2;
	}
	
	
	public static void main(String[] args) {
		Compute cp = new Compute();
		int res1 = cp.recurCompute(4);
		System.out.println(res1);
		
		int res2 = cp.NonRecurCompute(4);
		System.out.println(res2);
		
	}
}
