package rat_in_the_maze;


public class Step {
	
	int x,y,d;

    public Step(int x,int y,int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }
    
    public Step(int x,int y) {
        this.x = x;
        this.y = y;
        this.d = 0;
    }
    
    public void setD(int d){
    	this.d = d;
    }
  

}
