package chapter_3;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter weight
		System.out.print("Enter your weight in pounds: ");
		double weight = input.nextDouble() * .45359237;
		
		// Prompt user to enter height
		System.out.print("Enter your height in inches: ");
		double height = input.nextDouble() * .0254;
		
		// Calculate BMI
		double bmi = weight / Math.pow(height, 2);
		
		// Display BMI
		System.out.println("Your BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25.0)
			System.out.println("Normal");
		else if (bmi < 30.0)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}
