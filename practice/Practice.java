package practice;

public class Practice {
	public final int MAXSIZE=10;
	Object[] elem=new Object[MAXSIZE];
	public int currentLength=0;
	
	//返回顺序表当前长度 
	public int CurrSize(){
		return currentLength;
	}

	//清空顺序表
	public void Clear(){
		for(int i=0;i<currentLength;i++){
			elem[i]=null;
		}
	}
		
	//判断顺序表是否为空，空则返回true，否则返回false
	public boolean isEmpty(){
        /*for(int i=0;i<currentLength;i++)
			if (elem[i] !=null){
				return false;
				break;
			}
			else{
				return true;
				}
	        }*/
		if(currentLength==0){
			return true;
		}else{
			return false;
		}
	}
	
	 //获取顺序表中第i个元素
	public Object getValue(int i){
		return elem[i];
	}
}
