package polynomial_arithmetic;

public class Linked {
	private Node head=null;
	//private Node tail=null;
	private Node current=null;
	
	public Linked(){
		head= new Node();
		current=head;
		
	}
	
	public void AddNode(Node node){
		current.LinkNext(node);
		current=current.next();
		
	}
	
	public boolean isEmpty(){
		return head.next()==null;
	}
	
	public void print(){
		current=head.next();
		while (current!=null){
			if (current.getI()==0)
			System.out.print(current.getA());
			else if(current.getA()==0){
			}
			else if(current.getI()==1)
				System.out.print(current.getA()+"x");
			else{
				System.out.print(current.getA()+"x^"+current.getI());
				}
			current=current.next();
			if(current!=null&&current.getA()!=0){
			if (current.getA()>0)
				System.out.print("+");
			else{
			}
			}
		}
	}
	
	public static Linked plus(Linked p1,Linked p2){
		Linked result=new Linked();
		p1.current=p1.head.next();
		p2.current=p2.head.next();
		while(p1.current!=null && p2.current!=null){
			if(p1.current.getI()==p2.current.getI()){ 
				result.AddNode(new Node(p1.current.getA()+p2.current.getA(),p1.current.getI()));  
		         p1.current=p1.current.next();  
		         p2.current=p2.current.next();  
		     } 
			 else if(p1.current.getI()<p2.current.getI()){  
		         result.AddNode(new Node(p1.current.getA(),p1.current.getI()));  
		         p1.current=p1.current.next();    
		     }else{  
		         result.AddNode(new Node(p2.current.getA(),p2.current.getI()));  
		         p2.current=p2.current.next();  
		     } 
		}
		while(p1.current!=null){
		     result.AddNode(new Node(p1.current.getA(),p1.current.getI()));  
		     p1.current=p1.current.next();  
		}  
		while(p2.current!=null){  
		     result.AddNode(new Node(p2.current.getA(),p2.current.getI()));  
		     p2.current=p2.current.next();  
		}  
		return result;  
	}
	
	public static Linked minus(Linked p1,Linked p2){
		Linked result=new Linked();
		p1.current=p1.head.next();
		p2.current=p2.head.next();
		while(p1.current!=null && p2.current!=null){
			if(p1.current.getI()==p2.current.getI()){ 
				result.AddNode(new Node(p1.current.getA()-p2.current.getA(),p1.current.getI()));  
				p1.current=p1.current.next();  
		        p2.current=p2.current.next();  
		     } 
			 else if(p1.current.getI()<p2.current.getI()){  
		         result.AddNode(new Node(p1.current.getA(),p1.current.getI()));  
		         p1.current=p1.current.next();    
		     }else{
		         result.AddNode(new Node(-p2.current.getA(),p2.current.getI()));  
		         p2.current=p2.current.next();  
		     } 
		}
		while(p1.current!=null){
		     result.AddNode(new Node(p1.current.getA(),p1.current.getI()));  
		     p1.current=p1.current.next();  
		}  
		while(p2.current!=null){  
	         result.AddNode(new Node(-p2.current.getA(),p2.current.getI()));  
		     p2.current=p2.current.next();  
		}  
		return result;  
	}
	
	public static Linked multi(Linked p1,Linked p2){
		Linked result= new Linked();
		p1.current=p1.head.next();
		while (p1.current!=null){
			p2.current=p2.head.next();
			while(p2.current!=null){
				result.AddNode(new Node(p1.current.getA()*p2.current.getA(),p1.current.getI()*p2.current.getI()));
				p2.current=p2.current.next();
			}
			p1.current=p1.current.next();	
		}
		return result;
	}
	
	public static Linked diffi(Linked p1){
		Linked result = new Linked();
		p1.current=p1.head.next();
		while (p1.current!=null){
			if(p1.current.getI()!=0)
				result.AddNode(new Node(p1.current.getA()*p1.current.getI(),p1.current.getI()-1));
			else
				result.AddNode(new Node(p1.current.getA()*p1.current.getI(),0));
			p1.current=p1.current.next();
		}
		return result;
	}
	
	public static Linked same(Linked result){
		result.current=result.head.next();  
		Node zig=result.current;  
        Node zag=result.current.next();
		while(result.current.next()!=null){  
            while(zag!=null) {
                if(zag.getI()!=result.current.getI())
                {  
                    zag=zag.next();
                    zig=zig.next();
                }else{  
                    result.current.setA(result.current.getA()+zag.getA());  
                    zig.LinkNext(zag.next());
                    zag=zag.next();
                }  
            }  
            result.current=result.current.next();  
            zig=result.current;  
            zag=result.current.next();
        }         
        return result;  
    } 
}
	
class Node{
	private int a;
    private int i;
    private Node next;
    
    public Node(){
    }
		
    public Node(int a,int i){
    	this.a=a;
    	this.i=i;
    }
    
    public Node next(){
    	return this.next;
    }
    
    public void LinkNext(Node next){
    	this.next=next;
    }
    
    public void setA(int a){
    	this.a=a;
    }
    
    public int getA(){
    	return this.a;
    }
    
    public int getI(){
    	return this.i;
    }
		
		
	}
	


