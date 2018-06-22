package class91_heap;

public class Binary_heap {
	
	private int []array;
	private int currentSize=0;
	
	public Binary_heap(){
		array=new int [100];
		this.currentSize=0;
	}
	
	public Binary_heap(int capacity){  
		array=new int[capacity];
		this.currentSize=0;
	}
	
	public Binary_heap(int[]seq){
		this.array=new int[seq.length+1];
		for(int i=0;i<seq.length;i++){
			insert(seq[i]);
		}
	}
	
	public int currentSize(){
		return currentSize;
	}
	
	public int[] enlarge(){
		int[]item1=new int [array.length*2];
		for(int i=0;array[i]!=0;i++){
			item1[i]=array[i];
		}
		this.array=item1;
		return array;
	}
	
	public void insert(int x){
		if(this.currentSize>=array.length){
			enlarge();
		}
			int hole=++currentSize;
			while(x<array[hole/2]){
				array[hole]=array[hole/2];
				hole/=2;
			}
			array[hole]=x;
	}
	
	public void insert(int seq[]){
		for(int i=0;i<seq.length;i++){
			insert(seq[i]);
			print();
			
		}
	}
	
	public void print(){
		for(int i=1;i<=currentSize;i++){
			System.out.print(array[i]+"  ");
		}
		System.out.println();
	}
	
	public int deleteMin(){
		if(currentSize==0){
			System.out.print("Heap is empty.");
			return 0;
		}
		else{
			int a=array[1];
			percolateDown(1);
			return a;
		}
	}
	
	public void percolateDown(int hole){
		if(hole*2>=currentSize){
			array[hole]=array[currentSize];
		    currentSize--;
		}
		else {
			if(array[hole*2]<array[hole*2+1]){
				array[hole]=array[hole*2];
				percolateDown(hole*2);
			}
			else {
				array[hole]=array[hole*2+1];
				percolateDown(hole*2+1);
			}
		}
	}
	
	public int delete(int hole){
		int a=array[hole];
		percolateDown(hole);
		return a;
	}
	
	public void drcreaseKey(int p,int delta){
		int a=array[p]+delta;
		delete(p);
		insert(a);
	}
	
	public void increaseKey(int p,int delta){
		int a=array[p]-delta;
		delete(p);
		insert(a);
	}
	
	public void sortHeap(){
		int m=currentSize();
		for(int i=1;i<=m;i++){
			int a=array[1];
			delete(1);
			System.out.print(a+"  ");
		}
	}
}
