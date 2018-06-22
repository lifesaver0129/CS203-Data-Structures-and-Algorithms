package heap;

public class Binary_heap_test {
	
	public static void main (String[] args){
		
		int seq[]={45,36,18,53,72,30,48,93,15,35};
		Binary_heap H = new Binary_heap(seq);
		
		H.print();
		System.out.println(H.currentSize());
		
		H.deleteMin();
		H.print();
		
		H.delete(4,H);
		H.print();
		
		H.drcreaseKey(1, 20, H);
		H.print();
		
		H.increaseKey(4, 20, H);
		H.print();
		
	}
}
