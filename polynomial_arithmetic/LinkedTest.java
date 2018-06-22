package polynomial_arithmetic;

public class LinkedTest {    
	
	public static void main(String[] args) {
	    
		Linked p1=new Linked();  
		p1.AddNode(new Node(2,2)); 
		p1.AddNode(new Node(100,3));  
		p1.AddNode(new Node(45,5));  
		p1.AddNode(new Node(3,20));  
		System.out.print("p1=");  
		p1.print();
		System.out.println();
	         
		Linked p2=new Linked();  
		p2.AddNode(new Node(8,2)); 
		p2.AddNode(new Node(7,3));  
		p2.AddNode(new Node(4,4));
		p2.AddNode(new Node(6,6));  
		p2.AddNode(new Node(7,20));  
		System.out.print("p2=");   
		p2.print();
		System.out.println();
	    
		Linked resultList1= Linked.plus(p1, p2);  
		Linked.same(resultList1);
		System.out.print("p1+p2=");  
		resultList1.print();
		System.out.println();  
	    
		Linked resultList2= Linked.minus(p1, p2);  
		System.out.print("p1-p2=");  
		Linked.same(resultList2);
		resultList2.print();
		System.out.println(); 
		
		Linked resultList3= Linked.multi(p1, p2); 
		System.out.print("p1*p2=");  
		Linked.same(resultList3);
		resultList3.print();
		System.out.println(); 
		
		Linked resultList4_1= Linked.diffi(p1);
		Linked resultList4_2= Linked.diffi(p2);
		Linked.same(resultList4_1);
		Linked.same(resultList4_2);
		System.out.print("p1'=");  
		resultList4_1.print();
		System.out.println(); 
		System.out.print("p2'=");  
		resultList4_2.print();
		System.out.println(); 
	    
		
	        
	        /*  //多项式p3  
	        Linked p3=new Linked();  
	        p3.AddNode(new Node(2,1));  
	        p3.AddNode(new Node(3,2));  
	        p3.AddNode(new Node(4,3));  
	        System.out.println("p3="+p3.printS());  
	          
	          
	      //多项式p4  
	        Linked p4=new Linked();  
	        p4.AddNode(new Node(5,1));  
	        p4.AddNode(new Node(1,2));  
	        System.out.println("p4="+p4.printS());  
	          
	        //相乘  
	        Linked resuList2=Linked.multiply(p3, p4);  
	        System.out.println("p3*p4="+resuList2.printS());  
	                 
	    }  
	  */
	}  
}
