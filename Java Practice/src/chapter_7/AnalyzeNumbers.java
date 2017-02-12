package chapter_7;
import java.util.Scanner;

public class AnalyzeNumbers {

	public static void main(String[] args) {
		// Determine the number of numbers to be entered
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of numbers to be entered: ");
		int n = input.nextInt();
		
		// Declare array
		int [] numbers = new int [n];
		System.out.print("Please enter " + n + " numbers: ");
		for (int i = 0; i < n; i++ ) {
			numbers[i] = input.nextInt();
			if (!(n - 1 - i == 0))
				System.out.print("Please enter " + ((n-1) - i) + " more numbers: ");
		}
	
		// Calculate Variables
		double average = getAverage(numbers);
		int numbersGreaterThanAverage = getNumbersGreaterThanAverage(average, numbers);
		
		// Display the # of numbers greater than the average
				System.out.println("The number of numbers greater than the average is " + numbersGreaterThanAverage);
	}		
		
		// Calculate average of array
		public static double getAverage(int [] numbers) {
			double n = numbers.length;
			int sum = 0;
			for (int e: numbers)
				sum += e;
			double average = sum / n;
			return average;
		}
		
		// Calculate # of numbers greater than the average
		public static int getNumbersGreaterThanAverage(double average, int [] numbers) {
			int numbersGreaterThanAverage = 0;
			for (int e: numbers)
				if (e > average)
					numbersGreaterThanAverage += 1;
			return numbersGreaterThanAverage;
		}
}
