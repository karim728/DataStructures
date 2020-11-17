/*
 * 1]--> my logic is.: starting with a giving starting node, 1-->find all its neighbors, 
 * 2]--> add all neighbors into a queue, 
 * 3]--->mark  the node visited and remove it into the queue. 
 * 4]--> next node will be the head node in the queue.
 */
package bfs;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
	public static int[][] graph1 = {
								{0,1,1,0,0},
								{0,0,0,1,0},
								{0,0,0,0,1},
								{0,0,0,0,1},
								{0,0,1,0,0}};
	
	public static int graph2[][] = {
			{0,1,1,1,0,1,0,0,0},
			{1,0,1,0,0,1,1,1,0},
			{1,1,0,1,1,0,1,0,0},
			{1,0,1,0,1,1,1,1,0},
			{0,0,1,1,0,1,0,0,0},
			{1,1,0,1,1,0,1,1,1},
			{0,1,1,1,0,1,0,0,1},
			{0,0,0,0,0,1,1,1,0}
	};
	
	public static int[] visited;
	public static LinkedList<Integer> queue = new LinkedList<Integer>(); 
	public static int nextNode;
	public static int start=0;
	public static int end=4;
	
	
	public static void solve(int[][] graph,int s) {
		visited= new int[graph.length];
		queue.add(s);
		while(!queue.isEmpty()) {
			for(int i =0;i< graph.length;i++) {
				if(graph[queue.peek()][i]==1 && visited[i]==0) {
					queue.add(i);
					visited[i]=1;
					
				}
			}
			
//			visited[queue.peek()]=1;
			System.out.println("visited: "+ queue.peek());
			int r=queue.poll();
			System.out.println(queue);
			System.out.println("remove: "+ r);
		}

	}
	

}
