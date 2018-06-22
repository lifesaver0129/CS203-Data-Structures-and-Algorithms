package class8_binary_tree;

public class Bindry_tree {

	TreeNode root;
	
	public Bindry_tree(){
		this.root=null;
	}
	
	public Bindry_tree(TreeNode root){
		this.root=root;
	}
	
	public Bindry_tree(char root){
		TreeNode root1=new TreeNode(root);
		this.root=root1;
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
			root.setLeftChild(leftchild);
			root.setRightChild(rightchild);
		}
	}
	
	public void BreadthFirstTraverse() {
		TreeQueue q = new TreeQueue(10);
		TreeNode pointer = root;
		q.enQueue(root);
		while (!q.isEmpty()) {
			pointer = q.deQueue();
			System.out.print(pointer.getData() + " ");
			if (pointer.getLeftChild() != null) {
				q.enQueue(pointer.getLeftChild());
			}
			if (pointer.getRightChild() != null) {
				q.enQueue(pointer.getRightChild());
			}
		}
		System.out.println();
	}
	
	public void preOrderTraverse(TreeNode x){
		if(x==null){
		}
		else{
			System.out.print(x.getData()+" ");
			preOrderTraverse(x.getLeftChild());
			preOrderTraverse(x.getRightChild());
		}
	}
	
	public void inOrderTraverse(TreeNode x){
        if(x== null){
        }
        else{
            inOrderTraverse(x.getLeftChild());
            System.out.print(x.getData()+" ");
            inOrderTraverse(x.getRightChild());
        }
    }

	public void postOrderTraverse(TreeNode x){
        if(x== null){
        }
        else{
            postOrderTraverse(x.getLeftChild());
            postOrderTraverse(x.getRightChild());
            System.out.print(x.getData()+" ");
        }
    }
	
	public void preOrderTraverse() {
		TreeStack s=new TreeStack(10);
		TreeNode p=root;
		while(p!=null||!s.isEmpty()){
			while(p!=null){
				System.out.print(p.getData()+" ");
				s.push(p);
				p=p.getLeftChild();
			}
			if(!s.isEmpty()){
				p=s.top();
				s.pop();
				p=p.getRightChild();
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
				pointer=pointer.getLeftChild();
			}
			if(!s.isEmpty()){
				pointer=s.top();
				System.out.print(pointer.getData()+" ");
				s.pop();
				pointer=pointer.getRightChild();
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
			if(cur.getLeftChild()==null&&cur.getRightChild()==null||
					(pre!=null&&(pre==cur.getLeftChild()||pre==cur.getRightChild()))){
				System.out.print(cur.getData()+" ");
				s.pop();
				pre=cur;
			}else{
				if(cur.getRightChild()!=null){
					s.push(cur.getRightChild());
				}
				if(cur.getLeftChild()!=null){
					s.push(cur.getLeftChild());
				}
			}
		}
		System.out.println();
	}
	
	
	
}
