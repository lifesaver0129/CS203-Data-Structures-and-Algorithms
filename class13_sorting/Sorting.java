package class94_sorting;

import java.util.Arrays;

public class Sorting {
	
	private int array[];
	public Sorting(int a[]){
		this.array=a;
	}
	
	public void insertsort(){
		for(int i=0;i<array.length;i++){
			for(int j=i;j>0&&array[j]<array[j-1];j--){
				int a=array[j];	
				array[j]=array[j-1];
				array[j-1]=a;
				}
		}
		System.out.println(Arrays.toString(array));
	}
	
	public void shellsort(){
		for (int gap=array.length/2;gap>0;gap=gap/2){
			for(int i=gap;i<array.length;i++){
				int tmp=array[i];
				int j;
				for(j=i;j>=gap&&tmp<array[j-gap];j-=gap)
					array[j]=array[j-gap];
				array[j]=tmp;
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	public void puddlesort(){
		for(int i=0;i<array.length;i++){
			for(int j=1;j<=array.length-1;j++){
				if (array[j-1]>array[j]){
					int a=array[j];	
					array[j]=array[j-1];
					array[j-1]=a;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	public int partition(int array[],int low, int high){
		int pivotkey=array[low];
		if(high-low<=1){
			return 0;
		}
		while(low<high){
			while(low<high&&array[high]>=pivotkey)
				high--;
			int tmp=array[low];
			array[low]=array[high];
			array[high]=tmp;
			while(low<high&&array[low]<=pivotkey)
				low++;
			tmp=array[low];
			array[low]=array[high];
			array[high]=tmp;
		}
		return low;
	}
	
	public void quicksort(int array[], int low,int high){
		if(low!=high-1&&low!=high&&low!=high+1){
		    int pivotloc=partition(array,low,high);
	    	quicksort(array,low,pivotloc-1);
	    	quicksort(array,pivotloc+1,high);}
	    	else
	    		return;
	}
	
	public void quicksort(){
		int low=0;
		int high=this.array.length-1;
		quicksort(this.array,low,high);
		System.out.println(Arrays.toString(array));
	}
	
	public void heapsort(){
		Binary_heap m=new Binary_heap(array);
		int b[]=new int [array.length];
		for(int i=1;i<=array.length;i++){
			b[i-1]=m.deleteMin();
		}
		System.out.println(Arrays.toString(b));
	}
	
	public void merge(int A [],int left,int center,int right){
		int[] tmpA = new int[A.length];  
		int rindex = center + 1;
		int tindex = left; 
	    int lindex = left;      
	    while (lindex <= center && rindex <= right) {   
	    	if (A[lindex] <= A[rindex]) {  
	    		tmpA[tindex++] = A[lindex++];  
	    	} else {  
	    		tmpA[tindex++] = A[rindex++];   
	    	}   
	    }  
	    while (rindex <= right) {  
	    	tmpA[tindex++] = A[rindex++];   
	    }  
	    while (lindex <= center) {  
	    	tmpA[tindex++] = A[lindex++];   
	    }  
	    while (left <= right) {  
	    	A[left] = tmpA[left++];    
	    } 
	}
	
	public void mergesort(int a[],int left,int right){
		if(left<right){
			int center=(right+left)/2;
			mergesort(a,left,center);
			mergesort(a,center+1,right);
			merge(a,left,center,right);
		}
	}
	
	public void mergesort(){
		mergesort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	
	public void RadixSort(int[] A, int radix, int d) {  
        int[] tmp = new int[A.length];  
        int[] buckets = new int[radix];  
        int rate = 1;
        for (int i = 0; i < d; i++) {  
        	for(int p = 0; p < radix; p++)
        		buckets[p] = 0; 
            for(int l = 0; l < A.length; l++){
            	tmp[l] = A[l];
            }
            for (int j = 0; j < A.length; j++) {  
                int subKey = (tmp[j] / rate) % radix;  
                buckets[subKey]++;  
            }  
            for (int j = 1; j < radix; j++) {  
                buckets[j] = buckets[j] + buckets[j - 1];  
            }  
            for (int m = A.length - 1; m >= 0; m--) {  
                int subKey = (tmp[m] / rate) % radix;  
                A[--buckets[subKey]] = tmp[m];  
            }  
            rate *= radix;  
        }  
    } 	
	
	public void radixsort(){
		RadixSort(array,10,3);
		System.out.println(Arrays.toString(array));
	}
}
