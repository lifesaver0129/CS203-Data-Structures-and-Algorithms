package course8;

import course4.Sequeue_Node;
import course33.Stack_Node;

public class BinaryTree {
	private Node root;// 根节点

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(Node root) {
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	/**
	 * 广度优先遍历
	 */
	public void BreadthFirstTraverse() {
		Sequeue_Node q = new Sequeue_Node(10);
		Node pointer = root;
		q.enQueue(root);
		while (!q.isEmpty()) {
			pointer = q.deQueue();
			System.out.print(pointer.getData() + " ");
			if (pointer.getLeftChild() != null) {
				q.enQueue(pointer.getLeftChild());
			}
			if (pointer.getRightChild() != null) {
				q.enQueue(pointer.getRightChild());
			}
		}
		System.out.println();
	}

	/**
	 * 先根遍历 递归
	 */
	public void preOrderTraverse(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.getData() + " ");
		preOrderTraverse(node.getLeftChild());
		preOrderTraverse(node.getRightChild());

	}

	/**
	 * 中根遍历 递归
	 */
	public void inOrderTraverse(Node node) {
		if (node == null) {
			return;
		}
		inOrderTraverse(node.getLeftChild());
		System.out.print(node.getData() + " ");
		inOrderTraverse(node.getRightChild());
	}

	/**
	 * 后根遍历 递归
	 */
	public void postOrderTraverse(Node node) {
		if (node == null) {
			return;
		}
		postOrderTraverse(node.getLeftChild());
		postOrderTraverse(node.getRightChild());
		System.out.print(node.getData() + " ");
	}
	
	/**
	 * 先根遍历 非递归
	 */
	public void preOrderTraverse() {
		Stack_Node s=new Stack_Node(10);
		Node p=root;
		while(p!=null||!s.isEmpty()){
			while(p!=null){
				System.out.print(p.getData()+" ");
				s.push(p);
				p=p.getLeftChild();
			}
			if(!s.isEmpty()){
				p=s.top();
				s.pop();
				p=p.getRightChild();
			}
		}
		System.out.println();
	}

	/**
	 * 中根遍历 非递归
	 */
	public void inOrderTraverse() {
		Stack_Node s = new Stack_Node(10);
		Node pointer = root;
		
		while(pointer!=null||!s.isEmpty()){
			while(pointer!=null){
				s.push(pointer);
				pointer=pointer.getLeftChild();
			}
			if(!s.isEmpty()){
				pointer=s.top();
				System.out.print(pointer.getData()+" ");
				s.pop();
				pointer=pointer.getRightChild();
			}
		}
		System.out.println();
	}
	
	/**
	 * 后根遍历 非递归
	 */
	public void postOrderTraverse() {
		Stack_Node s=new Stack_Node(10);
		Node cur;//当前节点
		Node pre=null;//前一次访问的节点
		
		s.push(root);
		while(!s.isEmpty()){
			cur=s.top();
			//如何当前节点没有子节点或者子节点都已经被访问过
			if(cur.getLeftChild()==null&&cur.getRightChild()==null||
					(pre!=null&&(pre==cur.getLeftChild()||pre==cur.getRightChild()))){
				System.out.print(cur.getData()+" ");
				s.pop();
				pre=cur;
			}else{
				if(cur.getRightChild()!=null){
					s.push(cur.getRightChild());
				}
				if(cur.getLeftChild()!=null){
					s.push(cur.getLeftChild());
				}
			}
		}
		System.out.println();
		
	}
	
	
	

}
