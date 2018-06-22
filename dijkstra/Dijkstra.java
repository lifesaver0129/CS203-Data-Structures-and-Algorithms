package dijkstra;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dijkstra {
	Set<Node> open=new HashSet<Node>();
	Set<Node> close=new HashSet<Node>();
	Map<String,Integer> path=new HashMap<String,Integer>();
	Map<String,String> pathInfo=new HashMap<String,String>();
	
	public void calculate(Node A){
		Node shorter=getbest(A);
		if(shorter==null){
			return;
		}
		close.add(shorter);
		open.remove(shorter);
		Map<Node,Integer> childs=shorter.getChild();
		for(Node child:childs.keySet()){
			if(open.contains(child)){
				Integer newCompute=path.get(shorter.getData())+childs.get(child);
				if(path.get(child.getData())>newCompute){
					path.put(child.getData(), newCompute);
					pathInfo.put(child.getData(), pathInfo.get(shorter.getData())+"->"+child.getData());
				}
			}
		}
		calculate(A);
		calculate(shorter);
	}
	
	private Node getbest(Node node){
		Node X=null;
		int minDis=Integer.MAX_VALUE;
		Map<Node,Integer> childs=node.getChild();
		for(Node child:childs.keySet()){
			if(open.contains(child)){
				int distance=childs.get(child);
				if(distance<minDis){
					minDis=distance;
					X=child;
				}
			}
		}
		return X;
	}
	
	public void print(){
		Set<Map.Entry<String, String>> pathInfos=pathInfo.entrySet();
		for(Map.Entry<String, String> pathInfo:pathInfos){
			System.out.println(pathInfo.getKey()+":"+pathInfo.getValue());
		}
	}
	
	public Node firstone(){
        path.put("v2", 2);  pathInfo.put("v2", "v1->v2");  
        path.put("v3", Integer.MAX_VALUE);  pathInfo.put("v3", "v1");  
        path.put("v4", 1);  pathInfo.put("v4", "v1->v4");  
        path.put("v5", Integer.MAX_VALUE);  pathInfo.put("v5", "v1");  
        path.put("v6", Integer.MAX_VALUE);  pathInfo.put("v6", "v1");  
        path.put("v7", Integer.MAX_VALUE);  pathInfo.put("v7", "v1");  
        Node A=build(open,close);
		return A;
	}
	
	public Node build(Set<Node> start, Set<Node> end){
		
		Node v1=new Node("v1");
		Node v2=new Node("v2");
		Node v3=new Node("v3");
		Node v4=new Node("v4");
		Node v5=new Node("v5");
		Node v6=new Node("v6");
		Node v7=new Node("v7");
		
		v1.getChild().put(v2, 2);v1.getChild().put(v4, 1);
		v2.getChild().put(v4, 4);v2.getChild().put(v5, 10);
		v3.getChild().put(v1, 4);v3.getChild().put(v6, 5);
		v4.getChild().put(v3, 2);v4.getChild().put(v5, 2);v4.getChild().put(v6, 8);v4.getChild().put(v7, 4);
		v5.getChild().put(v7, 6);
		v7.getChild().put(v6, 1);
		
		start.add(v2);start.add(v3);start.add(v4);start.add(v5);start.add(v6);start.add(v7);
		end.add(v1);
		return v1;
	}
}
