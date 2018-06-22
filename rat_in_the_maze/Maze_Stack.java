package rat_in_the_maze;

import java.util.Stack;

public class Maze_Stack {
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
		int[][] move = {{ 0, 1}, { 1, 0},  { 0,-1}, {-1, 0}};
		Stack<Step> s = new Stack<Step>();
		path(maze, move, s);
	}
	  
	public static int path(int[][] maze,int[][] move,Stack<Step> s){
		s.push(new Step(1,1));
		while(s.isEmpty()!=true){
			for(int n=0; n<4;n++){
				int i = s.peek().x + move[n][0];
				int j = s.peek().y + move[n][1];
				if(maze[i][j] == 0){
					s.push(new Step(i,j));
					maze[i][j] = -1;
					if(i == 8 && j ==10){
						print(s);
						return 1; 
					}
					else{
						break;   
					}
				}
				if(n==3){
				     s.pop();
				}
			}  			
		}
		return 0;   
	}	
	
	public static void print(Stack<Step> s){
		Stack<Step> s2 = new Stack<Step>();
		while(s.isEmpty()!=true){
			Step step = s.pop();
			s2.push(step);
	        }
		while(s2.isEmpty()!=true){
			Step step = s2.pop();
			System.out.print("→("+step.x+","+step.y+")");
	        }
	}
}