package course8;

public class Test {

	public static void main(String[] args) {
		
		Node nodeH=new Node('H');
		Node nodeI=new Node('I');
		Node nodeJ=new Node('J');
		Node nodeL=new Node('L');
		Node nodeG=new Node('G');
		Node nodeD=new Node('D',nodeH,nodeI);
		Node nodeE=new Node('E');
		nodeE.setLeftChild(nodeJ);
		Node nodeF=new Node('F');
		nodeF.setLeftChild(nodeL);
		Node nodeB=new Node('B',nodeD,nodeE);
		Node nodeC=new Node('C',nodeF,nodeG);
		Node nodeA=new Node('A',nodeB,nodeC);
		
		BinaryTree tree=new BinaryTree(nodeA);
		tree.BreadthFirstTraverse();
		tree.preOrderTraverse(tree.getRoot());
		System.out.println();
		tree.inOrderTraverse(tree.getRoot());
		System.out.println();
		tree.postOrderTraverse(tree.getRoot());
		System.out.println();
		tree.inOrderTraverse();
		tree.preOrderTraverse();
		tree.postOrderTraverse();

	}

}
