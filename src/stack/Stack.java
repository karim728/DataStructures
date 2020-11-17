package stack;

public class Stack {
	private static int size;
	private static int top;
	private static int storage[];
	
	public Stack(int size) {
		this.size=size;
		storage = new int[size];
		top=0;
	}
	
	public static void print() {
		for (int i = 0; i < top; i++) {
//			if(storage[i]!=0)
			System.out.println(storage[i]);
		}
	}
	
	public static void push(int input) {
		if(top<size) {
		storage[top]=input;
		top++;
		System.out.println(input + " has been added");
		}else {
			System.out.println("storage is full "+ input + " cannot be added");
		}
	}
	
	public static void pop() {
		
		int dec=top-=1;
		System.out.println(storage[dec] + " has been deleted"+ dec);
		storage[dec]=0;
		
	}
}
