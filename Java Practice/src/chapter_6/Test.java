package chapter_6;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		
	}
	
		public static int getInteger() {
			
			// Create new Scanner object
						Scanner input = new Scanner(System.in);
			
			// Declare integer variable
			int i = 0;
				
			while (i < 10) {
				System.out.print("Enter an integer that has at least two digits: ");
				
				if (input.nextInt() > 10)
					i = input.nextInt();
				else
					System.out.println("Your entry was not an integer with at least two digits.");
				}
			return i;
		}
	

}
