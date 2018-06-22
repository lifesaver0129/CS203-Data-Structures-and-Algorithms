package class92_TreeNodes;

public class Tree_test {

	public static void main (String[] args){
		TreeNode A=new TreeNode('a');
		TreeNode B=new TreeNode('b');
		TreeNode C=new TreeNode('c');
		TreeNode D=new TreeNode('d');
		TreeNode R=new TreeNode('r');
		TreeNode E=new TreeNode('e');
		TreeNode F=new TreeNode('f');
		TreeNode G=new TreeNode('g');
		TreeNode H=new TreeNode('h');
		TreeNode K=new TreeNode('k');
		
		Tree T=new Tree();
		
		T.insert(A);
		T.insert(B);
		T.insert(C);
		T.insert(D);
		T.insertRoot(R);
		T.insert(E);
		T.insert(F);
		T.insert(G);
		T.insert(H);
		T.insert(K);
		
		A.setChildlist(new ChildNode(3,new ChildNode(5)));
		C.setChildlist(new ChildNode(6));
		R.setChildlist(new ChildNode(0,new ChildNode(1,new ChildNode(2))));
		F.setChildlist(new ChildNode(7,new ChildNode(8,new ChildNode(9))));
		
		T.LevelTraverse();
		System.out.println();
		T.RootFirstTraverse(T.getRoot());
	}
}
