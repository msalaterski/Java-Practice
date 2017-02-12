package chapter_3;

import java.util.Scanner;

public class ComputeTax {
	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
					
		//Prompt user to enter taxable income
		System.out.print("Enter your taxable income: ");
		double income = input.nextDouble();
		
		// Prompt user to enter filing status
		System.out.println("Enter your filing status."
				+ " Enter 0 for Single,"
				+ " 1 for Married Filing Jointly or Qualifying Widow(er),"
				+ " 2 for Married Filing Separately,"
				+ " 3 for Head of Household: ");
		
		int status = input.nextInt();
		
		// Compute tax based on filing status
			double tax = 0;
			
			if (status == 0) {
				if (income <= 8350)
					tax = income * 0.10;
				else if (income <= 33950)
					tax = (8350 * 0.10) + (income - 8350) * 0.15;
				else if (income <= 82250)
					tax = (8350 * 0.10) + (33950 - 8351) * 0.15 + 
						  (income - 33950) * 0.25;
				else if (income <= 171550)
					tax = (8350 * 0.10) + (33950 - 8351) * 0.15 + 
						  (82250 - 33951) * 0.25 + (income - 82250) * 0.28;
				else if (income <= 372950)
					tax = (8350 * 0.10) + (33950 - 8351) * 0.15 + 
						  (82250 - 33951) * 0.25 + (171550 - 82251) * 0.28 + 
						  (income - 171550) * 0.33;
				else
					tax = (8350 * 0.10) + (33950 - 8351) * 0.15 + 
						  (82250 - 33951) * 0.25 + (171550 - 82251) * 0.28 + 
						  (3729510 - 171551) * 0.33 + (income - 372950);
				}
			else if (status == 1) { // Left as an exercise
				//Compute tax for married file jointly or qualifying widow(er)
			}
			else if (status == 2) { // Left as an exercise
				//Compute tax for married separately
			} 
			else if (status == 3) { // Left as an exercise
				//Compute tax for head of household
			}
			else {
				System.out.println("Error: invalid status");
				System.exit(1);
			}
			
			// Display the result
			System.out.println("Tax is " + (int)(tax * 100) / 100.0);
	}
}
