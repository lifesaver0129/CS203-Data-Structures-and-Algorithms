package tree_node_2_2_many;

public class Tree_2 {
	
	TreeNode root=null;
	
	public Tree_2(){
		this.root=null;
	}
	
	public Tree_2(TreeNode root){
		this.root=root;
	}

	public void addFirstChild(TreeNode a, TreeNode b){
		a.setFirstChild(b);
	}
}
