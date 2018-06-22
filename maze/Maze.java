package maze;

	import java.util.ArrayList;
	import java.util.List;
	
	public class Maze {
		
	private int[][] data = null;//数据1：障碍，0：出路,-1:此点已经通过
	private List<Point> queue = new ArrayList<Point>() ;//用数组模拟队列操作

	public Maze(int[][] data){   //出使化
	this.data = data ;
	}

	public boolean getPath2(Point start, Point end){//使用队列找到起点到终点的最短路径
	int index = -1 ;//队列中下标值 
	Point temp = null ;
	boolean isFind = false ;
	int x=-1 , y=-1 , di=-1 ;
	queue.add(start) ;//起点入队列
	this.data[start.getX()][start.getY()] = - 1 ; //起点标记为走过
	while(!queue.isEmpty() && !isFind){
	index++ ;
	temp = queue.get(index) ;//得到队列中寻找的节点
	if(temp.equals(end)){
	printPath2(index) ;//index为终点在队列中的下标值
	return true ;
	}

	isFind = false ;
	for(di = 0 ; di<4 ; di++){
	switch(di){
	case 0: x = temp.getX() - 1 ; y = temp.getY() ; break ;//向上
	case 1: x = temp.getX() ; y = temp.getY() + 1 ; break ;//向右
	case 2: x = temp.getX() + 1 ; y = temp.getY() ; break ;//向下
	case 3: x = temp.getX() ; y = temp.getY() - 1 ; break ;//向左
	default : break ;
	}

	if(this.data[x][y] == 0){//节点是通路
	queue.add(new Point(x , y , index)) ;
	this.data[x][y] = -1 ;//将此点标记为走过
	}
	}
	}
	return false ;
	}

	

	public void printPath2(int x){
	int index = x ;//终点在队列中的下标
	while(index != -1){
	int pre = queue.get(index).getDirection() ;//得到前一个点的下标
	queue.get(index).setDirection(-1) ;//将我们需要的路径上的点的前驱置为-1
	index = pre ;
	}

	for(int i=0,len=queue.size() ; i<len ; i++){
	Point p = queue.get(i) ;
	if(p.getDirection() == -1){
	System.out.println("[" + p.getX() + "," + p.getY() + "]");
	}
	}
	}
	
	public static void main(String[] args) {
		int mg[][] =       //定义迷宫，0代表通路，1代表障碍
			 {{1,1,1,1,1,1,1,1,1,1,1,1},
		                {1,0,0,0,0,0,1,1,0,0,0,1},
		                {1,1,0,1,1,0,0,0,0,1,0,1},
	              	{1,1,0,0,1,0,1,1,1,1,0,1},
	         		{1,1,0,1,0,0,0,0,0,1,0,1},
	         		{1,1,0,1,1,1,0,1,1,0,0,1},
	         		{1,1,0,0,0,1,0,0,0,1,0,1},
	         		{1,0,0,1,0,0,0,1,0,0,1,1},
	          		{1,0,1,1,0,1,0,0,1,0,0,1},    
	          		{1,1,1,1,1,1,1,1,1,1,1,1}};
		
		Maze m = new Maze(mg) ;
		Point p1 = new Point(1 , 1 ) ;
		Point p2 = new Point(8 , 10 ) ;
		// m.getPath(p1 , p2) ;
		m.getPath2(p1 , p2) ;
		}}

	


