package class6_KMP;

public class KMP {
	private String T; 	//目标字符串
	private String P;	//模式字符串
	private int[] next;
	//private int[] optnext;
	
	public KMP(String T, String P){
		this.T = T;
		this.P = P;
		this.next = new int[P.length()];
		//this.optnext = new int[P.length()];
	}
	
	//计算next数组
	public void findNext(){ 
		int j,k;
		next[0] = -1;
		j = 0; k = -1;
		while(j < P.length()-1){
			while(k >=0 && P.charAt(k) != P.charAt(j))
				k = next[k];
			j++;
			k++;
			next[j] = k;
		}
	}
	
//	//计算优化版next数组
//	public void findOptimalizedNext(){
//		int j,k;
//		optnext[0] = -1;
//		j = 0; k = -1;
//		while(j < P.length()-1){
//			while(k >=0 && P.charAt(k) != P.charAt(j))
//				k = optnext[k];
//			j++;
//			k++;
//			if(P.charAt(k) == P.charAt(j))
//				optnext[j] = optnext[k];
//			else 
//				optnext[j] = k;
//		}
//	}
	
	
	public void printNext(){
		for(int i = 0; i < P.length(); i++){
			System.out.print(P.charAt(i)+" ");
		}
		System.out.println();

		for(int i = 0; i < P.length(); i++){
			System.out.print(next[i]+" ");
		}
		System.out.println();
	}
	

//	public void printOptNext(){
//		for(int i = 0; i < P.length(); i++){
//			System.out.print(P.charAt(i)+" ");
//		}
//		System.out.println();
//
//		for(int i = 0; i < P.length(); i++){
//			System.out.print(optnext[i]+" ");
//		}
//		System.out.println();
//	}
	
	//KMP匹配过程
	public int KMPStrMatch(){
		int pLen = P.length();
		int tLen = T.length();
		
		int i = 0;
		int j = 0;
		
		while(j < pLen && i < tLen ){
			if(j == -1 || T.charAt(i) == P.charAt(j)){
				i++;
				j++;
			}else
				j = next[j];
		}
		if(j >= pLen)
			return (i-pLen);
		else
			return -1;
	}
	
	
	public static void main(String[] args) {
		String T = "ababababababb";
		String P = "abababb";
		//String P = "abcaababc";
		
		KMP kmp = new KMP(T,P);
		
		kmp.findNext();
		kmp.printNext();
		
//		kmp.findOptimalizedNext();
//		kmp.printOptNext();
		
		int pos = kmp.KMPStrMatch();
		System.out.println("\n" + pos);
	}
}