package tree_node_2_2_many;

import java.util.List;

public class  Bindry_tree {
	
    TreeNode root;
	TreeNode firstchild;
	TreeNode nextsibling;
 
	public Bindry_tree (TreeNode root){
		this.root=root;
		}
	
	public void addrootNode(char data){
		if (root==null){
			TreeNode A=new TreeNode(data);
			this.root=A;
		}
		else{
			System.out.println("Already has a root!");
		}
	}
	
	public void setRootNode(TreeNode leftchild,TreeNode rightchild){
		if(root==null){
			System.out.println("No root node");
		}
		else{
			root.setFirstChild(leftchild);
			root.setNextSibling(rightchild);
		}
	}
	
	public void BreadthFirstTraverse() {//这里用广度优先算法
		TreeQueue q = new TreeQueue(10);
		TreeNode pointer = root;
		q.enQueue(root);
		while (!q.isEmpty()) {
			pointer = q.deQueue();//将原有的二叉树树节点一个一个出队列
			transfer(pointer);//出队列的同时将其转换，由上至下
			if (pointer.getFirstChild() != null) {
				q.enQueue(pointer.getFirstChild());
			}
			if (pointer.getNextSibling() != null) {
				q.enQueue(pointer.getNextSibling());
			}
		}
		System.out.println();
	}
	
	public void transfer(TreeNode a){//转换的具体过程是检查他们的第一儿子节点有没有兄弟，如果有，则连同他的儿子和他儿子的兄弟一起加到孩子群里
		TreeNode m=a.firstChild;
		while(m!=null){
			 addChild(a, m);
			 m=m.nextSibling;
		}

	}

	 public void addChild(TreeNode x, TreeNode y)  //加孩子的方法：加孩子到孩子群（数组）里
	    {  
		       x.getChildList().add(y);  
		    
	    }   
	 
	 public void travel(TreeNode node) {
			node.print();
				List<TreeNode> list = node.getChildList();
				if (list != null && list.size() > 0) {
					for (TreeNode temp : list) {
						travel(temp);
					}
				}
			}
}
