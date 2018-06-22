package polynomial_arithmetic;
	  
public class Array{  	

	 public static void finddegree(double[] a,double[]b ){
		 double[] higher=a.length>b.length?a:b;
		 int s=higher.length-1;
		 System.out.println("Degree: "+s);
	 }
	
	public static void addition(double[] a,double[] b){
	    double[] higher=a.length>b.length?a:b;  
	    double[] lower=a.length>b.length?b:a; 
	    
	  
	    double[] res=new double[higher.length];  
	    for(int i=0;i<higher.length;i++){
	    	if(i<lower.length){  
	    		res[i]=higher[i]+lower[i];   
	    	}  
	    	else{  
	    		res[i]=higher[i];   
	    	}   
	    }  
	    System.out.print("Addition: ");
	    for(int i=res.length-1;i>0;i--){
	    	System.out.print(res[i]+"x^"+i+"+");   
	    }
	    System.out.println(res[0]);    
	}  
	      
	public static void subtraction(double[] a,double[] b){  
		double[] higher=a.length>=b.length?a:b;  
		double[] lower=a.length>=b.length?b:a;  
		double[] res=new double[higher.length];  
		if(higher==a){  
			for(int i=0;i<higher.length;i++){  
				if(i<lower.length){  
					res[i]=higher[i]-lower[i];  
				}  
				else{  
					res[i]=higher[i];   
				}   
			}  
		}else{  
			for(int i=0;i<higher.length;i++){  
				if(i<lower.length){  
					res[i]=lower[i]-higher[i];  
				}  
				else{  
					res[i]=-higher[i];  
				}  
			}  
		}  
		
		int k=res.length-1;  
		for(;res[k]==0.0&&k>0;k--);
		double[] newres=new double[k+1];  
		for(int m=0;m<newres.length;m++){  
			newres[m]=res[m];  
		}  
		
		System.out.print("Subtraction: ");
		for(int i=res.length-1;i>0;i--){
	    	System.out.print(res[i]+"x^"+i+"+");   
	    }
	    System.out.println(res[0]);    
	}  
	
	public static void multiplication(double[] a,double[] b){  
		double[] res=new double[a.length+b.length-1];  
		for(int i=0;i<a.length;i++){  
			for(int j=0;j<b.length;j++){  
				res[i+j]+=a[i]*b[j];  
			}  
		}  
		System.out.print("Multiplication: ");
		for(int i=res.length-1;i>0;i--){
	    	System.out.print(res[i]+"x^"+i+"+");   
	    }
	    System.out.println(res[0]);    
	}  
	
	public static void differentiation(double[]a,double[]b){
		if (a.length>1){
		double []res1=new double[a.length-1];
		for (int i=a.length-1;i>0;i--){
			res1[i-1]=a[i]*i;
		}
		System.out.print("Differentiation: ");
		System.out.print("a:(");
		for(int i=res1.length-1;i>0;i--){
	    	System.out.print(res1[i]+"x^"+i+"+");   
	    }
	    System.out.print(res1[0]+")dx   ");    
		}
		else
			System.out.print("Differentiation: a: 0dx   ");
		
		if (b.length>1){
	    double []res2=new double[b.length-1];
	    for (int i=b.length-1;i>0;i--){
			res2[i-1]=b[i]*i;
		}
		System.out.print("b:(");
		for(int i=res2.length-1;i>0;i--){
	    	System.out.print(res2[i]+"x^"+i+"+");   
	    }
	    System.out.println(res2[0]+")dx");    
		}
		else
			System.out.print("b: 0dx");
	}  


} 