package chapter_9;

import chapter_7.SelectionSort;
import java.util.Random;
import java.text.NumberFormat;

public class TestStopwatch {

	public static void main(String[] args) {
		
		// Create Random object
		Random random = new Random(50000);
		
		// Create Stopwatch object for sort time
		Stopwatch sortTime = new Stopwatch();
		
		// Create Stopwatch object for time array initialization and sort time
		Stopwatch initAndSortTime = new Stopwatch();
		
		// Initialize array with random numbers
		initAndSortTime.start();
		double[] array = new double[100000];
		for (int i = 0; i < 100000; i++)
			array[i] = random.nextInt(1001);
		
		// Time the sorting of the array
		sortTime.start();
		SelectionSort.selectionSort(array);
		sortTime.end();
		
		// Time initializing and sorting
		initAndSortTime.end();
		
		// Display elasped time excluding array initialization in seconds
		String s = NumberFormat.getIntegerInstance().format(array.length);
		System.out.println("The program sorted " + s + " numbers in " + sortTime.getElapsedTime()/1000 + " seconds.");
		
		// Display elapsed time including array initialization in seconds
		System.out.println("The program initialized and sorted " + s + " numbers in " + initAndSortTime.getElapsedTime()/1000 + " seconds.");
	}

}
