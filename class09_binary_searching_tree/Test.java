package course9;

public class Test {

	public static void main(String[] args) {
		int []sequence={35,17,18,15,22,60,51,88,93};
		BinarySearchTree bst=new BinarySearchTree(sequence);
		BinarySearchTree.InOrderTraverse(bst.getRoot());
		System.out.println();
		bst.insertValue(50);
		BinarySearchTree.InOrderTraverse(bst.getRoot());
		System.out.println();
		System.out.println(BinarySearchTree.searchValue(93, bst.getRoot()));
		bst.deleteValue(60);
		BinarySearchTree.InOrderTraverse(bst.getRoot());
		System.out.println();
		bst.deleteValue(35);
		BinarySearchTree.InOrderTraverse(bst.getRoot());
		System.out.println();
		
		BinarySearchTree bst2=new BinarySearchTree();
		BinarySearchTree.InOrderTraverse(bst2.getRoot());
		System.out.println();
	}

}
