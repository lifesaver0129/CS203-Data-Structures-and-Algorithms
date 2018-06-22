package class1_array;

import java.util.Arrays;

public class arrList {
	public final int MAXSIZE = 10; //顺序表最大长度
	Object[] elem=new Object[MAXSIZE];//object可存储任意类型
	private int currentLength = 0; //顺序表当前长度
	
	//返回顺序表当前长度 
	public int currSize() {
		return currentLength;
	}
	
	//清空顺序表
	public void clear() {
		for (int i=0;i<currentLength;i++){
			elem[i]=null;
		}
	}
	
	//判断顺序表是否为空，空则返回true，否则返回false
	public boolean isEmpty() {
		if(currentLength==0){
			return true;
		}else{
			return false;
		}
	}

    //获取顺序表中第i个元素
	public Object get(int i) {
		return elem[i-1];
		}

    //移除顺序表第i个元素，第i+1之后的元素都前移一位
	public void remove(int i) {
		if(i<1||i>currentLength){
			System.out.println("移除元素非法");
		}else{
			System.out.println("remove");
			for (int index=i;index<currentLength;index++){
				elem[index-1]=elem[index];
			}
			elem[currentLength-1]=null;
			currentLength--;
		}
	}

   //在顺序表末位添加一个元素
	public void insertElement(Object obj) {
		elem[currentLength]=obj;
		currentLength++;
	}
	
    //打印顺序表
	public void printList() {
		System.out.println(Arrays.toString(elem));
	}
	
	//返回顺序表容量
	public int maxSize() {
		return MAXSIZE;
	}
	
    //在顺序表第i个位置插入一个元素
	public void insertElenmentAT(int i, Object obj) {
		if (i < 0 || i > currentLength) {
			System.out.println("插入非法");
		} else {
			for (int index = currentLength; index > i - 1; index--) {
				elem[index] = elem[index - 1];
			}
			elem[i - 1] = obj;
		}
		currentLength++;
	}
}


