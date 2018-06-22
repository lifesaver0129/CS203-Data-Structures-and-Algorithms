package course10;

public class Test {

	public static void main(String[] args) {
		int minHeap[] = { 10, 100, 18, 53, 72, 30, 48, 93, 15, 35 };
		
		BinaryHeap bh = new BinaryHeap(minHeap);
		bh.sortHeap();

	}

}
