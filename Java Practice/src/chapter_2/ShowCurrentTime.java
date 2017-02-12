package chapter_2;

public class ShowCurrentTime {
	public static void main(String[] args) {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		//Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		//Obtain the current second
		long currentSecond = totalSeconds % 60;
		
		//Obtain the total minutes since midnight, Jan 1, 1970
		long totalMinutes = totalSeconds / 60;
		
		// Obtain the current minute
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hours since midnight, Jan 1, 1970
		long totalHours = totalMinutes / 60;
		
		// Obtain the current hour
		long currentHour = (totalHours % 24) - 5;
		
		System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " EST.");
	}
}
