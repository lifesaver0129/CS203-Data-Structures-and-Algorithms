package pre_in_post_order_traversal;

public class Expression_tree_test {
	public static void main(String[] arg){
		TreeNode A=new TreeNode('B');
		TreeNode B=new TreeNode('C');
		TreeNode C=new TreeNode('*',B,A);
		TreeNode D=new TreeNode('D');
		TreeNode E=new TreeNode('/',C,D);
		TreeNode F=new TreeNode('A');
		TreeNode G=new TreeNode('+',F,E);
		Expression_tree M=new Expression_tree(G);
		M.preOrderTraverse();
		M.inOrderTraverse();
		M.postOrderTraverse();
	}
}
