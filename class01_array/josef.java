package class1_array;

import java.util.Arrays;
import java.util.Scanner;

public class josef {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;//总人数
		int m;//每轮出列的人的报数
		int index=0;//每轮出列人物序号（不是数组下标）
		System.out.print("请输入总人数：");
		n=input.nextInt();
		System.out.print("请输入每轮出列的人的报数:");
		m=input.nextInt();
		
		int person[]=new int[n]; //原始序列人数
		int newPerson[]=new int[n];//出列人的序数
		for(int i=0;i<n;i++){
			person[i]=i+1;
		}
		System.out.println(Arrays.toString(person));
		
		//i 为剩余的人数
		for(int i=n;i>1;i--){
			index+=m;//从当前位置向后数m个人
	
			if(i<index){//如果当前序列总人数<向后报数得到人数
				index=index%i;//求余
				if(index==0){//如果正好被整除，说明被移除的人是序列中最后一位人
					index=i;
				}
			}
			newPerson[n-i]=person[index-1];//将被移除的人放入出列人的序列
			removeAt(person,index,i);//执行移除操作
			index--;//移除后，当前序号应减1
		}
		newPerson[n-1]=person[0];
		System.out.println(Arrays.toString(newPerson));
		input.close();
	}
	
	//将第index个人移出，index后续人物前移
	public static void removeAt(int array[],int index,int curSize){
		for(int i=index;i<curSize;i++){
			array[i-1]=array[i];
			array[i]=0;
		}
		
	}


}
