package chapter_2;

import java.util.Scanner;

public class Exercise_2_6 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		public void EnterInteger() {
		// Prompt user to enter integer between 0 and 1000
			System.out.print("Enter an integer between 0 and 1000: ");
			if (input.nextInt() >= 0 && input.nextInt() <= 1000) {
				int integer = input.nextInt();
			}
			else {
				System.out.print("The value you entered was not an integer between 0 and 1000. Please enter an integer between 0 and 1000.");
				EnterInteger();
			}
		}
		
		
		}
	}

