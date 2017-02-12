package chapter_1;

public class Exercise_1_10 {
	public static void main(String[] args) {
		double distanceInKm = 14;
		double distanceInMiles = 14 * (1 / 1.6);
		double seconds = 45 * 60 + 30;
		double minutes = seconds / 60;
		double hours = minutes / 60;
		double averageSpeedInMiles = distanceInMiles / hours;
		System.out.println(averageSpeedInMiles);
		
		//.75833333 miles
	}
}
