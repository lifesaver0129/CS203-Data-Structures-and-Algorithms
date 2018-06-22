package Exercise12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Huffman {
	private Node root;
	private int[] count;// 第i字符出现的次数
	private String[] codes;// 第i字符的哈夫曼编码
	public Huffman() {
		codes = new String[256];
	
	}

	/**
	 * 找出文本中每个字符出现次数
	 * @param text 传入文本
	 */
	public void getCharacterFrequency(String text) {
		count = new int[256];// 256 ASCII 

		for (int i = 0; i < text.length(); i++) {
			count[(int) text.charAt(i)]++;
		}
	}

	/**
	 * 创建哈夫曼树
	 */
	public void getHuffmanTree() {
		ArrayList<Node> list = new ArrayList<Node>();

		// 创建每个哈夫曼节点，并将其添加到List中	
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				list.add(new Node(count[i], (char) i));
			}
		}

		while (list.size() != 1) {
			// 先找出List中权值最小的两个节点
			Node minNode1 = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if (minNode1.getWeight() > list.get(i).getWeight()) {
					minNode1 = list.get(i);
				}
			}
			list.remove(minNode1);

			Node minNode2 = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if (minNode2.getWeight() > list.get(i).getWeight()) {
					minNode2 = list.get(i);
				}
			}
			list.remove(minNode2);

			list.add(new Node(minNode1.getWeight() + minNode2.getWeight(),
					minNode1, minNode2));
		}
		root = list.get(0);
		root.setCode("");
	}

/**
 * 递归方式：给每个叶子节点的哈夫曼编码赋值
 * @param n 根节点
 */
	public void assignCode(Node n) {
		if (n.getLeft() != null) {
			n.getLeft().setCode(n.getCode() + "0");
			assignCode(n.getLeft());

			n.getRight().setCode(n.getCode() + "1");
			assignCode(n.getRight());
		} else {
			codes[(int) n.getElement()] = n.getCode();
		}
	}
	
	/**
	 * 非递归方式：给每个叶子节点的哈夫曼编码赋值
	 */
	public void assignCode(){
		Queue<Node> qu=new LinkedList<Node>();
		
		qu.offer(root);
		Node n;
		while(!qu.isEmpty()){
			n=qu.poll();
			if(n.getLeft()!=null){
				n.getLeft().setCode(n.getCode()+"0");
				qu.offer(n.getLeft());
				n.getRight().setCode(n.getCode()+"1");
				qu.offer(n.getRight());
			}
			codes[(int)n.getElement()]=n.getCode();
		
		}
	}

	/**
	 * 输出哈夫曼编码
	 */
	public void printHuffman() {
		System.out.printf("%-15s%-15s%-15s%-15s\n", "ASCII Code", "Character",
				"Frequency", "Code");
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.printf("%-15d%-15c%-15d%-15s\n", i, (char) i, count[i],
						codes[i]);
			}
		}
	}

	public Node getRoot() {
		// TODO Auto-generated method stub
		return this.root;
	}
}
