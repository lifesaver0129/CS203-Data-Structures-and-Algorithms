package dijkstra;

import java.util.HashMap;
import java.util.Map;

public class Node {
	private String data;  
	private Map<Node,Integer> child=new HashMap<Node,Integer>();  
    
    public Node(String data){  
        this.data=data;  
    }  

	public String getData() {  
        return data;  
    }  
   
    public Map<Node, Integer> getChild() {  
        return child;  
    }  
}
