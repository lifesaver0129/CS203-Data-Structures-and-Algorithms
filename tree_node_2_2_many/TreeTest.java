package tree_node_2_2_many;

public class TreeTest {

	public static void main(String[] arg){
		TreeNode M=new TreeNode('m');
		TreeNode L=new TreeNode('l');
		TreeNode K=new TreeNode('k',0,L);
		TreeNode J=new TreeNode('j');
		TreeNode I=new TreeNode('i',0,J);
		TreeNode H=new TreeNode('h',M,I);
		TreeNode G=new TreeNode('g');
		TreeNode F=new TreeNode('f');
		TreeNode E=new TreeNode('e',K,F);
		TreeNode D=new TreeNode('d',H);
		TreeNode C=new TreeNode('c',G,D);
		TreeNode B=new TreeNode('b',E,C);
		TreeNode A=new TreeNode('a',B);
		Bindry_tree T=new Bindry_tree(A);
		
		T.BreadthFirstTraverse();
		T.travel(A);
	}
}
