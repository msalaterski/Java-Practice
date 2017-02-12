package chapter_2;

import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt User to enter amount
		System.out.print("Enter an amount of money e.g., 1450.94: ");
		double amount = input.nextDouble();
		
		// Convert Amount into cents
		double cents = amount * 100;
		
		// Find the number of dollars
		int dollars = (int)(cents / 100);
		int remainingCents  = (int)(cents % 100);
		
		// Find the number of quarters
		int quarters  = remainingCents / 25;
		remainingCents %= 25;
		
		// Find the number of dimes
		int dimes = remainingCents / 10;
		remainingCents %= 10;
		
		// Find the number of nickels
		int nickels = remainingCents / 5;
		remainingCents %= 5;
		
		// Declare new variable for pennies
		int pennies = remainingCents;
		
		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("    " + dollars + " dollars");
		System.out.println("    " + quarters + " quarters");
		System.out.println("    " + dimes + " dimes");
		System.out.println("    " + nickels + " nickels");
		System.out.println("    " + pennies + " pennies");
	}
}
