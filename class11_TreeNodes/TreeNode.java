package class92_TreeNodes;

public class TreeNode {

	private char data;
	
	private ChildNode Childlist;
	
	public TreeNode(){
		this.data=0;
		this.Childlist=null;
	}
	
	public TreeNode(char m){
		this.data=m;
		this.Childlist=null;
	}
	
	public TreeNode(char m,ChildNode x){
		this.data=m;
		this.Childlist=x;
	}
	
	public void setData(char a){
		this.data=a;
	}
	
	public char getData(){
		return this.data;
	}
	
	public void setChildlist(ChildNode x){
		this.Childlist=x;
	}
	
	public ChildNode getChildNode(){
		return this.Childlist;
	}
}
