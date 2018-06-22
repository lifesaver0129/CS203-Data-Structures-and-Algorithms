package course10;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryHeap {
	private int[] array; // 存放堆节点数组
	private int currentSize; // 堆节点元素个数
	private final int DEFAULT_CAPACITY = 15;// 最大容量

	//Question 3
	public BinaryHeap() {
		array = new int[this.DEFAULT_CAPACITY];
		currentSize = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Input a sequence of integer end with -1");
		int value = input.nextInt();
		while (value != -1) {
			this.insert(value);
			value = input.nextInt();
		}
		input.close();
		System.out.println(Arrays.toString(array));
	}

	//Question 1
	public BinaryHeap(int seq[]) {
		array = new int[this.DEFAULT_CAPACITY];
		currentSize = seq.length;
		for (int i = 0; i < this.currentSize; i++) {
			array[i] = seq[i];
		}
		int left, right, father, register, minIndex;
		for (int i = currentSize / 2 - 1; i >= 0; i--) {
			father = i;
			left = i * 2 + 1;
			right = i * 2 + 2;
			while (left < currentSize || right < currentSize) {
				minIndex = findMinIndex(father, left, right);
				if(minIndex==father){
					break;
				}else{
					register=array[father];
					array[father]=array[minIndex];
					array[minIndex]=register;
					father=minIndex;
					left=father*2+1;
					right=father*2+2;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

	//Question 2
	public void insert(int x) {
		int c = currentSize;
		if (currentSize == this.DEFAULT_CAPACITY) {
			System.out.println("Out of range");
			return;
		}

		int father = (c - 1) / 2;
		while (c > 0) {
			if (array[father] > x) {
				array[c] = array[father];
				c = father;
				father = (c - 1) / 2;
				continue;
			}
			break;
		}
		array[c] = x;
		currentSize++;

	}

	//Question 5
	public void sortHeap() {
		int register = currentSize;
		for (int i = currentSize - 1; i >= 0; i--) {
			array[i] = deleteMin();
		}
		currentSize = register;
		System.out.println(Arrays.toString(array));
	}

	//Question 4
	public int deleteMin() {
		if (this.currentSize == 0) {
			System.out.println("There is no node in binaryheap");
			return 0;
		} else {
			int deleteNode = array[0];
			array[0] = array[currentSize - 1];
			array[currentSize - 1] = 0;
			currentSize--;
			int father = 0;
			int leftChild = 1;
			int rightChild = 2;
			int minIndex;
			int register;
			while (leftChild < currentSize || rightChild < currentSize) {
				minIndex = findMinIndex(father, leftChild, rightChild);
				if (minIndex == father) {
					break;
				} else {
					register = array[father];
					array[father] = array[minIndex];
					array[minIndex] = register;
					father = minIndex;
					leftChild = father * 2 + 1;
					rightChild = father * 2 + 2;
				}
			}

			return deleteNode;
		}

	}
	
	/**
	 * 
	 * @param a  index of father
	 * @param b  index of leftChild
	 * @param c  index of rightChild
	 * @return the min value of array[a],array[b],array[c]
	 */

	public int findMinIndex(int a, int b, int c) {
		if (c == this.currentSize) {
			if (array[a] < array[b]) {
				return a;
			} else {
				return b;
			}
		} else {
			if (array[a] <= array[b] && array[a] <= array[c]) {
				return a;
			} else if (array[b] <= array[a] && array[b] <= array[c]) {
				return b;
			} else {
				return c;
			}
		}

	}
}
