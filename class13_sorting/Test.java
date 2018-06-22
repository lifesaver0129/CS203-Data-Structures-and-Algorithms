package class94_sorting;

public class Test {
	
	public static void main(String[] args){
		int a[]={49,38,65,97,76,13,27,49};
		Sorting sort=new Sorting(a);
		//sort.insertsort();
		//sort.shellsort();
		//sort.puddlesort();
		//sort.quicksort();
		//sort.heapsort();
		//sort.mergesort();
		sort.radixsort();
	}
}
