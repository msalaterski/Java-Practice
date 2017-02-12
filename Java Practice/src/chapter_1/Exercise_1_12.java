package chapter_1;

public class Exercise_1_12 {
	public static void main(String[] args) {
		//Declarations
		double milesRan = 24;
		double kmRan = milesRan * 1.6;
		double minutes = 100;
		double hours = minutes / 60.0;
		double kmPerHour = kmRan / hours;
		System.out.println(kmPerHour);
	}
}
