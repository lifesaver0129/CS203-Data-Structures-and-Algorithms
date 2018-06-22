package class92_TreeNodes;

public class Tree {

	private TreeNode tree[];
	private int num;
	private int root;
	private int cap;
	
	public Tree(){
		tree = new TreeNode[100];
		num = -1;
		root = -1; 
		this.cap = 100;
	}
	
	public Tree(int cap){
		tree = new TreeNode[cap];
		num = -1;
		root = -1; 
		this.cap = cap;
	}

	public void insert(TreeNode a){
		if(cap<num+2){
			System.out.print("No Extra space!");
		}else{
			num=num+1;
			tree[num]=a;
		}
	}
	
	public void insertRoot(TreeNode a){
		if(cap<num+2){
			System.out.print("No Extra space!");
		}else{
			num=num+1;
			tree[num]=a;
			root=num;
		}
	}
	
	public TreeNode getRoot(){
		return this.tree[root];
	}
	
	public void LevelTraverse(){
		Queue queue = new Queue(20);
		TreeNode node = this.getRoot();
		if(node == null)
			System.out.println("The tree is empty");
		else{
			queue.enQueue(node);
			while(!queue.isEmpty()){
				node = queue.deQueue();
				System.out.print(node.getData()+" ");
				ChildNode cld = node.getChildNode();
				while(cld != null){
					queue.enQueue(tree[cld.getData()]);
					cld = cld.getNext();
				}
			}
		}
	}
	
	public void RootFirstTraverse(TreeNode root){
		if(root != null){
			System.out.print(root.getData()+" ");
			ChildNode cld = root.getChildNode();
			while(cld != null){
				RootFirstTraverse(tree[cld.getData()]);
				cld = cld.getNext();
			}
		}
	}
}
