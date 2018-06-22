package maze;

public class Point {
	private int x;
	private int y;
	private int direction;//如果使用栈，此变量代表从此点经过时候的方向，0：上，1：右，2：下，3：左；如果使用队列，则此变量代表路径中此点的前一个节点在队列中的下标值

	public Point(){
	this.x = 0 ; 
	this.y = 0 ;
	this.direction = -1 ;
	}

	public Point(int x , int y){
	this.x = x ;
	this.y = y ;
	this.direction = -1 ;
	}

	public Point(int x , int y , int direction){
	this.x = x ;
	this.y = y ;
	this.direction = direction ;
	}


	public int getX() {
	return x;
	}


	public void setX(int x) {
	this.x = x;
	}


	public int getY() {
	return y;
	}


	public void setY(int y) {
	this.y = y;
	}


	public int getDirection() {
	return direction;
	}


	public void setDirection(int direction) {
	this.direction = direction;
	}


	@Override
	public boolean equals(Object obj) {
	if(obj instanceof Point){
	Point p = (Point)obj ;
	if((p.getX() == this.x) && (p.getY() == this.y)){
	return true ;
	}else{
	return false ;
	}
	}
	return false ;
	}


	@Override
	public int hashCode() {
	return super.hashCode() + x + y;
	}
	
}

