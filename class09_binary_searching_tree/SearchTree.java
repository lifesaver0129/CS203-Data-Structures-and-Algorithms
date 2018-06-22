package class9_binary_searching_tree;

public class SearchTree {
	
	TreeNode root;
	
	public SearchTree(){
		this.root=null;
	}

	public SearchTree(TreeNode x){
		this.root=x;
	}
	
	public SearchTree(int x){
		TreeNode u=new TreeNode(x);
		this.root=u;
	}
	
	public void MakeEmpty(SearchTree m){
	    TreeNode x=m.root;    
	    MakeEmpty(x);
	}
	
	public void MakeEmpty(TreeNode x){
		if(x== null){
        }
        else{
        	MakeEmpty(x.getLeft());
        	MakeEmpty(x.getRight());
            x=null;
        }
	}
	
	public boolean isEmpty(){
		if(root==null)	
			return true;
		else
			return false;
	}
	
	public boolean find(int x,TreeNode m){//采用递归的方法
		if(m==null){
			return false;
		}
		if(x<m.getData())
			return find(x,m.getLeft());
		else if (x>m.getData())
			return find(x,m.getRight());
		else 
			return true;
	}
	
	public TreeNode find(int x,SearchTree t){
		TreeNode r=t.root;
		while(r!=null&&r.getData()!=x)
			if(x<r.getData()){
				r=r.getLeft();
			}else{
				r=r.getRight();
			}	
		return r;
	}
	
	public TreeNode findMin(SearchTree t){
		TreeNode r=t.root;
		while(r.getLeft()!=null){
			r=r.getLeft();
		}
		return r;
	}
	
	public TreeNode findMin(TreeNode r){
		while(r.getLeft()!=null){
			r=r.getLeft();
		}
		return r;
	}
	
	public TreeNode findMax(SearchTree t){
		TreeNode r=t.root;
		while(r.getRight()!=null){
			r=r.getRight();
		}
		return r;
	}
	
	public void insert(int a, SearchTree t){
		TreeNode x=new TreeNode(a);
		if (isEmpty()==true){
			root=x;
		}else if(find(a,root)){
			System.out.println("Same value existed!");
		}else{
			TreeNode pre;
			TreeNode temp=root;
			while(true){
				pre=temp;
				if(a<temp.getData()){
					temp=temp.getLeft();
					if(temp==null){
						pre.setLeft(x);
						return;
					}
				}else{
					temp=temp.getRight();
					if(temp==null){
						pre.setRight(x);
						return;
					}
				}
			}
		}	
	}
	
	public void insert (int[]a,SearchTree t){
		if(a.length==0){
			return;
		}
		for(int i=0;i<=a.length-1;i++){
			insert(a[i],t);
		}
	}
	
	@SuppressWarnings("null")
	public void delete(int a, SearchTree t){
		if (isEmpty()==true){
			return;
		}else if(find(a,root)!=true){
			System.out.println("Not found");
		}else{
			TreeNode temp=root;
			TreeNode pre=temp;
			TreeNode m=null;
			while(true){
				pre=temp;
				if(a<temp.getData()){
					temp=temp.getLeft();
					if(temp.getData()==a){
						break;
					}
				}else if(a>temp.getData()){
					temp=temp.getRight();
					if(temp.getData()==a){
						break;
					}
				}
			}
			if(temp.getLeft()==null&&temp.getRight()==null){
				if( pre.getData()<temp.getData()){
					pre.setRight(null);
				}else
					pre.setLeft(null);
			}else if(temp.getLeft()==null&&temp.getRight()!=null){
				if( pre.getData()<temp.getData()){
					pre.setRight(temp.getRight());
				}else
					pre.setLeft(temp.getRight());
			}else if(temp.getLeft()!=null&&temp.getRight()==null){
				if( pre.getData()<temp.getData()){
					pre.setRight(temp.getLeft());
				}else
					pre.setLeft(temp.getLeft());
			}else if(temp.getLeft()!=null&&temp.getRight()!=null){
				    m.setData(findMin(temp).getData());
					delete(findMin(temp).getData(),t);
					m.setLeft(temp.getLeft());
					m.setRight(temp.getRight());
					if( pre.getData()<temp.getData()){
						pre.setRight(m);
					}else
						pre.setLeft(m);
			}
		}
				
	}
				
			
		
		
	
			
		
	

	
	public void retrieve(TreeNode x){
		if(x== null){
        }
        else{
        	retrieve(x.getLeft());
            System.out.print(x.getData()+" ");
            retrieve(x.getRight());
        }
    }
	
}
