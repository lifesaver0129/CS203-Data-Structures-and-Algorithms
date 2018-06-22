package rat_in_the_maze;

import java.util.ArrayList;
import java.util.List;

public class Maze_Queue{
	public static void main(String[] args) {
		   int[][] maze = {{1,1,1,1,1,1,1,1,1,1,1,1},
			               {1,0,0,0,0,0,1,1,0,0,0,1},
			               {1,1,0,1,1,0,0,0,0,1,0,1},
			               {1,1,0,0,1,0,1,1,1,1,0,1},
			               {1,1,0,1,0,0,0,0,0,1,0,1},
			               {1,1,0,1,1,1,0,1,1,0,0,1},
			               {1,1,0,0,0,1,0,0,0,1,0,1},
			               {1,0,0,1,0,0,0,1,0,0,1,1},
			               {1,0,1,1,0,1,0,0,1,0,0,1},    
			               {1,1,1,1,1,1,1,1,1,1,1,1}};
		   int [][] move = {{ 0, 1}, { 1, 0},  { 0,-1}, {-1, 0}};
		   List<Step> q = new ArrayList<Step>() ;
		   path(maze,move,q) ;		
	}
	
	public static int path(int[][]maze,int [][]move, List<Step>q){ 
		int index = -1 ;
		Step temp = null ;
		q.add(new Step(1,1,-1)) ;
		while(!q.isEmpty()){
			index++ ;
			temp = q.get(index) ;
			if(temp.x==8&&temp.y==10){
				print(index,q) ;
				return 1 ;
			}
			for(int n=0; n<4;n++){
				int i = temp.x + move[n][0];
				int j = temp.y + move[n][1];
				if(maze[i][j] == 0){
					q.add(new Step(i,j,index));
					maze[i][j] = -1;
				}
			}
		}
		return 0;
	}

	public static void print(int index,List<Step>q){
		while(index!= -1){
			int preIndex = q.get(index).d ;
			q.get(index).setD(-1) ;
			index = preIndex;
		}
		for(int i=0 ; i<q.size() ; i++){
			if(q.get(i).d == -1){
				System.out.print("→("+q.get(i).x+","+q.get(i).y+")");
			}
		}
	}
}