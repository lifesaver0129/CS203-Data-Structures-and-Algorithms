package class1_array;

import java.util.Arrays;
import java.util.Scanner;

public class Move {

	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
		int n;//数组长度n
		int k;//右移位数k
		int register;//附加存储空间
		System.out.print("请输入数组长度n：");
		n=input.nextInt();
		System.out.print("请输入右移位数k：");
		k=input.nextInt();
		
		int number[]=new int[n]; //数组
		for(int i=0;i<n;i++){
			number[i]=i+1;
		}
		System.out.println(Arrays.toString(number));
		
		for(int i=k;i>0;i--){
			register=number[n-1];
			for(int j=n-1;j>0;j--){
				number[j]=number[j-1];
			}
			number[0]=register;
		}
		System.out.println(Arrays.toString(number));
		input.close();

	}

}


