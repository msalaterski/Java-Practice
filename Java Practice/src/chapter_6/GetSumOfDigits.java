package chapter_6;
import java.util.Scanner;

/** Get the sum of the digits of the integer and display the sum */
public class GetSumOfDigits {
	public static void main(String[] args) {
		
		int integer = getInteger();
		int[] digits = getDigits(integer);
		int sum = 0;
		
		for (int i : digits)
			sum += i;
		System.out.println("The sum of the digits of the integer " + integer + " is " + sum);
	}
		
	/** Store the digits of the integer into an array */
	public static int[] getDigits(int i) {

		int integer = i;
		double integerWithRemainder = integer;
		int numberOfDigits = Integer.toString(integer).length();
		int[] digits = new int[numberOfDigits];
		int counter = 1;
		while (numberOfDigits > (counter - 1)) {
			digits[numberOfDigits - counter] = (int)integerWithRemainder % 10;
			integerWithRemainder /= 10; 
			counter++;
		}
		return digits;
	}	
		
	/** Get the integer through user input */	
	public static int getInteger() {
		
		// Create new Scanner object
		Scanner input = new Scanner(System.in);
		
		// Declare integer variable
		int i = 0;
		
		// Get user input and return it to the method
		while (i < 10) {
			System.out.print("Enter an integer that has at least two digits: ");	
			i = Math.abs(input.nextInt());
			if (i < 10) {
				i = 0;
				System.out.println("Your entry was not an integer with at least two digits.");
			}
		}
		return i;	
	}	
}
