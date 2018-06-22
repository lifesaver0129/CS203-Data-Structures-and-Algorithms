package class8_binary_tree;

public class Bindry_tree_Test {

	public static void main(String[] args){
		Bindry_tree M=new Bindry_tree('a');
		TreeNode J=new TreeNode('j');
		TreeNode I=new TreeNode('i');
		TreeNode H=new TreeNode('h');
		TreeNode G=new TreeNode('g',J);
		TreeNode F=new TreeNode('f');
		TreeNode E=new TreeNode('e',I);
		TreeNode D=new TreeNode('d',G,H);
		TreeNode C=new TreeNode('c',F);
		TreeNode B=new TreeNode('b',D,E);
		M.setRootNode(B, C);
		
		
		TreeQueue q=new TreeQueue (15);
		
		//广度优先遍历
		q.BFS_enQueue(M.root);
		q.BFS_print();
		//或者
		M.BreadthFirstTraverse();
		System.out.println();
		
		
		//深度优先遍历_先序_递归
		M.preOrderTraverse(M.root);
		System.out.println();
		
		//深度优先遍历_中序_递归
		M.inOrderTraverse(M.root);
		System.out.println();
		
		//深度优先遍历_后序_递归
		M.postOrderTraverse(M.root);
		System.out.println();
		System.out.println();
		
		
		TreeStack s=new TreeStack(15);
		
		//深度优先遍历_先序_非递归
		s.preOrderTraverse(M.root);
		//或者
	    M.preOrderTraverse();
		
	    //深度优先遍历_中序_非递归
		s.inOrderTraverse(M.root);
		//或者
	    M.inOrderTraverse();
		
	    ///深度优先遍历_后序_非递归
		M.postOrderTraverse();
	}
}
