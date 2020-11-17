import java.util.HashSet;
import java.util.Set;

import bfs.Bfs;
import stack.Stack;

public class Driver {
public static  Stack mystack = new Stack(5);
static Bfs bfs;
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
	public static void main(String[] args) {
		bfs.solve(graph2,0);
	}
}
