package tree;

public class Node {
	Node right;
	Node left;
	public int data;
	
	public Node(int data) {
		this.data= data;
		this.right=null;
		this.left=null;
	}
	
	
	public  void insert(int value) {
		if(value <= data) {
			
			if(left==null) {
				left= new Node(value);
				System.out.println("Node created "+ value);
			}else {
				left.insert(value);
				System.out.println("adding "+ value +" to the left of:"+ data);
			}
		}else if(value >= data) {
			
			if(right==null) {
				right= new Node(value);
				System.out.println("Node created "+ value);
			}else {
				right.insert(value);
				System.out.println("adding "+ value +" to the right of:"+ data);
			}
		}
	}
} 