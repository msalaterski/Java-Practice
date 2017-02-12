package chapter_9;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date theDate = new Date(10000);
		for (int i = 0; i < 8; i++) {
			System.out.println("During iteration " + (i + 1) + ", the date is " + theDate.toString() + ".");
			theDate.setTime(theDate.getTime() * 10);	
		}
	}

}
