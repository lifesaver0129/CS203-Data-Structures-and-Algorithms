package polynomial_arithmetic;

import java.util.Scanner;

public class ArrayTest {
	
	    @SuppressWarnings("resource")
		public static void main(String[] args) {  
	    	
	    System.out.println("数组{1,2,3,4}  表示多项式4x^3+3x^2+2x+1");
	    System.out.println("请输入数组a，用英文逗号隔开");
	    Scanner sc1=new Scanner(System.in);
	    String inputString1=sc1.next().toString();
	    String[] a=inputString1.split(",");
	    System.out.println("请输入数组b，用英文逗号隔开");
	    Scanner sc2=new Scanner(System.in);
	    String inputString2=sc2.next().toString();
	    String[] b=inputString2.split(",");
	    
	    double []a1 =new double[a.length];
	    for(int i=0;i<a.length;i++){
	      a1[i] = Double.parseDouble(a[i]);
	    }
	    double []b1 =new double[b.length];
	    for(int i=0;i<b.length;i++){
	      b1[i] = Double.parseDouble(b[i]);
	    }

	    Array.finddegree(a1, b1);  
	    Array.addition(a1, b1);
	    Array.subtraction(a1, b1);
	    Array.multiplication(a1, b1);
	    Array.differentiation(a1,b1);
		}  	
}  

