package course9;

import java.util.Scanner;

public class BinarySearchTree {
	private Node root;
	
	//Question 1
	public BinarySearchTree(int[] seq) {
		int length = seq.length;
		root=new Node(-100000);
		Node n[] = new Node[length];
		n[0] = new Node(seq[0]);
		root.setRightChild(n[0]);
		Node p;
		for (int i = 1; i < length; i++) {
			p = root.getRightChild();
			n[i] = new Node(seq[i]);
			while (true) {
				if (n[i].getValue() > p.getValue()) {
					if (p.getRightChild() != null) {
						p = p.getRightChild();
					} else {
						p.setRightChild(n[i]);
						break;
					}
				} else {
					if (p.getLeftChild() != null) {
						p = p.getLeftChild();
					} else {
						p.setLeftChild(n[i]);
						break;
					}
				}
			}
		}
	}
	
	//Question 4
	public BinarySearchTree(){
		root=new Node(-100000);
		Scanner input=new Scanner(System.in);
		int value;
	
		System.out.println("please input an integar sequence end with -1");
		value=input.nextInt();
		while(value!=-1){
			this.insertValue(value);
			value=input.nextInt();
		}
		System.out.println("end input");
		input.close();
	}

	public static void InOrderTraverse(Node n) {
		if (n == null) {
			return;
		}
		InOrderTraverse(n.getLeftChild());
		System.out.print(n.getValue() + " ");
		InOrderTraverse(n.getRightChild());
	}

	//Question 2
	public static boolean searchValue(int value, Node n) {

		if (n == null) {
			return false;
		}
		else if (n.getValue() == value) {
			return true;
		}
		else if (value > n.getValue()) {
			return searchValue(value, n.getRightChild());
		} 
		else {
			return searchValue(value, n.getLeftChild());
		}
	}
	//Question 2
	public Node searchValue(int value) {
		Node p = root.getRightChild();
		while (p != null) {
			if (p.getValue() == value) {
				return p;
			}
			else if(p.getValue() < value) {
				p = p.getRightChild();
			} else {
				p = p.getLeftChild();
			}
		}
		return null;
	}

	//Question 5
	public static Node findMin(Node n) {
		Node p = n;
		while (p.getLeftChild() != null) {
			p = p.getLeftChild();
		}
		return p;
	}

	//Question 6
	public Node deleteValue(int value) {
		Node p=searchValue(value);
		if(p==null){
			System.out.println("no such node");
			return null;
		}else{
			Node q=root;// p's father
			
			//find p's father
			while(q.getLeftChild()!=p&&q.getRightChild()!=p){
				if(value>q.getValue()){
					q=q.getRightChild();
				}else{
					q=q.getLeftChild();
				}
			}
		
			System.out.println("father(q)=" +q.getValue()+" current(p)="+p.getValue());
			// have no child
			if(p.getLeftChild()==null&&p.getRightChild()==null){
				if(q.getLeftChild()==p){
					q.setLeftChild(null);
				}else{
					q.setRightChild(null);
				}
			}
			// have one child
			else if(p.getLeftChild()!=null&&p.getRightChild()==null){
				if(q.getLeftChild()==p){
					q.setLeftChild(p.getLeftChild());
				}else{
					q.setRightChild(p.getLeftChild());
				}
				p.setLeftChild(null);
			}
			//have one child
			else if(p.getLeftChild()==null&&p.getRightChild()!=null){
				if(q.getLeftChild()==p){
					q.setLeftChild(p.getRightChild());
				}else{
					q.setRightChild(p.getRightChild());
				}
				p.setRightChild(null);
			}
			//have two child
			else{
				//step1
				Node min=findMin(p.getRightChild());//smallest node of rightTree
				min=this.deleteValue(min.getValue());//delete smallest value
				//step2,3
				min.setLeftChild(p.getLeftChild());
				p.setLeftChild(null);
				min.setRightChild(p.getRightChild());
				p.setRightChild(null);
				//step4
				if(q.getLeftChild()==p){
					q.setLeftChild(min);
				}else{
					q.setRightChild(min);
				}
			}
			return p;
		}
	

	}
	
	
    //Question 3
	public void insertValue(int value) {

		Node n = new Node(value);
		Node p = root;
		if (searchValue(value, root)) {
			System.out.println("do not insert");
		} else {
			if (root == null) {
				root = n;
				return;
			}
			while (true) {
				if (n.getValue() > p.getValue()) {
					if (p.getRightChild() != null) {
						p = p.getRightChild();
					} else {
						p.setRightChild(n);
						break;
					}
				} else {
					if (p.getLeftChild() != null) {
						p = p.getLeftChild();
					} else {
						p.setLeftChild(n);
						break;
					}
				}
			}
		}
	}

	//Question 3
	public void insertNode(Node n) {
		Node p = root;
		if (root == null) {
			root = n;
			return;
		}
		while (true) {
			if (n.getValue() > p.getValue()) {
				if (p.getRightChild() != null) {
					p = p.getRightChild();
				} else {
					p.setRightChild(n);
					break;
				}
			} else {
				if (p.getLeftChild() != null) {
					p = p.getLeftChild();
				} else {
					p.setLeftChild(n);
					break;
				}
			}
		}
	}

	// return root's rightchild!
	public Node getRoot() {
		return root.getRightChild();
	}

	public void setRoot(Node root) {
		this.root = root;
	}

}
