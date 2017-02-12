package chapter_3;

public class Checkpoint_3_16 {
	public static void main(String[] args) {
		
		// a. random integer a such that 0 <= i < 20
		int a = (int) (Math.random() * 20);
		System.out.println("A random integer such that 0 <= i < 20: " + a);
		
		// b. random integer b such that 10 <= i < 20
		int b = (int) (Math.random() * 10) + 10;
		System.out.println("A random integer such that 10 <= i < 20: " + b);
		
		// c. random integer c such that 10 <= i <= 50
		int c = (int) (Math.random() * 41) + 10;
		System.out.println("A random integer such that 10 <= i < 50: " + c);
		
		// d. expression that returns 0 or 1 randomly
		int d = (int) (Math.random() * 2);
		System.out.println("A random integer that is either 0 or 1: " + d);
		
	
	
	}
}
