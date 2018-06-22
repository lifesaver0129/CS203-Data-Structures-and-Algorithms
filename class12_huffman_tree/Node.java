package Exercise12;


public class Node {
	private char element;//字符
	private int weight;//权值
	private Node left;//左节点	
	private Node right;//右节点	
	private String code;//哈夫曼编码
	
	public Node(int weight, Node left, Node right) {
		this.weight = weight;
		this.left = left;
		this.right = right;
	}
	
	public Node(int weight, char element) {
		this.weight = weight;
		this.element = element;
	}

	public char getElement() {
		return element;
	}

	public void setElement(char element) {
		this.element = element;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
