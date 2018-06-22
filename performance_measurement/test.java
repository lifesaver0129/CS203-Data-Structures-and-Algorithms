package performance_measurement;

//import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class test {
	//@SuppressWarnings("resource")
	public static void main (String[] args){
		 System.out.print("请输入数组的长度：");
		@SuppressWarnings("resource")
		int number = new Scanner(System.in).nextInt();
		  int [] ArrayNum = new int [number];
		 // System.out.print("数组的长度："+number+"\n"+"数组元素为：");
		  
		  for(int i=0;i<number;i++)
		  {
		   int max=20;
		   int min=-10;
		   Random random = new Random();
		   //int s = random.nextInt(max)%(max-min+1) + min;
		   ArrayNum[i] = (int)(random.nextInt(max)+min);
		   //ArrayNum[i] = (int)(Math.random()*10);
		   System.out.print(ArrayNum[i]+" ");
		  }
		  
		 long begin1 = System.nanoTime(); 
		  //long begin = System.currentTimeMillis(); 
		  System.out.println();
		  System.out.println(maxSubSum1(ArrayNum));
		  //long end = System.currentTimeMillis() - begin;
		  long end1 = (System.nanoTime() - begin1);
		  System.out.printf("%.9f",(double)end1/1000000000);
		  
		  long begin2 = System.nanoTime();
		  System.out.println();
		  System.out.println(maxSubSum2(ArrayNum));
		  long end2 = (System.nanoTime() - begin2);
		  System.out.printf("%.9f",(double)end2/1000000000);
		  
		  long begin3 = System.nanoTime();
		  System.out.println();
		  System.out.println(maxSubSum3(ArrayNum));
		  long end3 = (System.nanoTime() - begin3);
		  System.out.printf("%.9f",(double)end3/1000000000);
		  
		  long begin4 = System.nanoTime();
		  System.out.println();
		  System.out.println(maxSubSum4(ArrayNum));
		  long end4 = (System.nanoTime() - begin4);
		  System.out.printf("%.9f",(double)end4/1000000000);
		  
		  
	}
	
	public static int maxSubSum1(int [] a){
		int maxSum=0;
		for (int i=0;i<a.length;i++)
		    for (int j=i;j<a.length;j++){
		    	
		    	int thisSum=0;
		        for (int k=i;k<=j;k++){
		    	
		        	thisSum+=a[k];
		    	    if(thisSum>=maxSum)
		    		    maxSum=thisSum;
		         }
		    }
		return maxSum;
	   }
   
	public static int maxSubSum2(int []a ){
		int maxSum=0;
		for (int i=0;i<a.length;i++){
			int thisSum=0;
			for (int j=i;j<a.length;j++){
				thisSum+=a[j];
				
				if(thisSum>maxSum)
					maxSum=thisSum;
			}
		}
		return maxSum;
	}
	
	private static int maxSumRec(int[]a,int left,int right){
		if (left==right)
			if(a[left]>0)
				return a[left];
			else 
				return 0;
		
		int center=(left+right)/2;
		int maxLeftSum=maxSumRec(a,left,center);
		int maxRightSum=maxSumRec(a,center+1,right);
		
		int maxLeftBorderSum=0,leftBorderSum=0;
		for (int i=center;i>=left;i--){
			leftBorderSum+=a[i];
			if(leftBorderSum>maxLeftBorderSum)
				maxLeftBorderSum=leftBorderSum;
		}
			
		int maxRightBorderSum=0,rightBorderSum=0;
		for (int i=center+1;i<=right;i++){
		    rightBorderSum+=a[i];
			if(rightBorderSum>maxRightBorderSum)
				maxRightBorderSum=rightBorderSum;
		}
		
		return max3(maxLeftSum,maxRightSum,maxLeftBorderSum+maxRightBorderSum);
		
	}


	private static int max3(int maxLeftSum, int maxRightSum, int i) {
		if (maxLeftSum>=maxRightSum){
			if (maxLeftSum>=i)
				return maxLeftSum;
			else
				return i;
		}
		else if(maxRightSum>=i){
			return maxRightSum;
		}
		else return i;
	}

	public static int maxSubSum3(int []a){
		return maxSumRec(a,0,a.length-1);
		
	}
	
	public static int maxSubSum4(int []a){
		int maxSum=0,thisSum=0;
		for(int j=0;j<a.length;j++){
			thisSum+=a[j];
			
			if(thisSum>maxSum)
				maxSum=thisSum;
			else if(thisSum<0)
				thisSum=0;
		}
		return maxSum;
	}
		
	
}