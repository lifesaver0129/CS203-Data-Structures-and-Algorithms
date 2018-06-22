package pre_in_post_order_traversal;

public class Expression_tree {

	TreeNode root;
	
	public Expression_tree(){
		this.root=null;
	}
	
	public Expression_tree(TreeNode x){
		this.root=x;
	}
	
	public Expression_tree(char x){
		TreeNode y=new TreeNode(x);
		this.root=y;
	}
	
	public void setRootNode(TreeNode left,TreeNode right){
		if(root==null){
			System.out.println("No root node");
		}
		else{
			root.setLeft(left);
			root.setRight(right);
		}
	}
	
	public void preOrderTraverse() {
		TreeStack s=new TreeStack(10);
		TreeNode p=root;
		while(p!=null||!s.isEmpty()){
			while(p!=null){
				System.out.print(p.getData()+" ");
				s.push(p);
				p=p.getLeft();
			}
			if(!s.isEmpty()){
				p=s.top();
				s.pop();
				p=p.getRight();
			}
		}
		System.out.println();
	}
	
	public void inOrderTraverse() {
		TreeStack s = new TreeStack(10);
		TreeNode pointer = root;
		while(pointer!=null||!s.isEmpty()){
			while(pointer!=null){
				s.push(pointer);
				pointer=pointer.getLeft();
			}
			if(!s.isEmpty()){
				pointer=s.top();
				System.out.print(pointer.getData()+" ");
				s.pop();
				pointer=pointer.getRight();
			}
		}
		System.out.println();
	}
	
	public void postOrderTraverse() {
		TreeStack s=new TreeStack(10);
		TreeNode cur;//当前节点
		TreeNode pre=null;//前一次访问的节点
		s.push(root);
		while(!s.isEmpty()){
			cur=s.top();
			//如何当前节点没有子节点或者子节点都已经被访问过
			if(cur.getLeft()==null&&cur.getRight()==null||
					(pre!=null&&(pre==cur.getLeft()||pre==cur.getRight()))){
				System.out.print(cur.getData()+" ");
				s.pop();
				pre=cur;
			}else{
				if(cur.getRight()!=null){
					s.push(cur.getRight());
				}
				if(cur.getLeft()!=null){
					s.push(cur.getLeft());
				}
			}
		}
		System.out.println();
	}
	
}
