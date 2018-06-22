package tree_node_2_2_many;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
//这里同时写了很多构造方法 目的是让多叉树和二叉树用同一种节点
	public char data;
	public TreeNode firstChild;
	public TreeNode nextSibling;
	public TreeNode parent;
		
	private List<TreeNode> childList;
	
	public TreeNode(char data)  
    {  
        this.data = data;  
        this.firstChild=this.nextSibling=null; 
        this.childList = new ArrayList<TreeNode>();  
    }  
	
	public TreeNode(char data,TreeNode firstChild){
		this.data=data;
		this.firstChild=firstChild;
		this.nextSibling=null;
		this.childList = new ArrayList<TreeNode>(); 
	}
	
	public TreeNode(char data,int a,TreeNode nextSibling){
		this.data=data;
		this.firstChild=null;
		this.nextSibling=nextSibling;
		this.childList = new ArrayList<TreeNode>(); 
	}
	
	public TreeNode(char data,TreeNode firstChild,TreeNode nextSibling){
		this.data=data;
		this.firstChild=firstChild;
		this.nextSibling=nextSibling;
		this.childList = new ArrayList<TreeNode>(); 
	}

	public void setData(char data){
		this.data=data;
	}
	
	public char getData(){
		return this.data;
	}
	
	public void setParent(TreeNode parent){
		this.parent=parent;
	}
	
	public TreeNode getFirstChild(){
		return this.firstChild;
	}
	
	public void setFirstChild(TreeNode a){
		this.firstChild=a;
	}
	
	public TreeNode getNextSibling(){
		return this.nextSibling;
	}
	
	public void setNextSibling(TreeNode b){
		this.nextSibling=b;
	}
	
	 public List<TreeNode> getChildList() {  
	        return childList;  
	    }  
	 
	 public void print(){
		 System.out.println(data);
	 };
}
