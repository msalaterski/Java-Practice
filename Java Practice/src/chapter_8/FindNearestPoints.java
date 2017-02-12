package chapter_8;

import java.util.Arrays;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class FindNearestPoints {

	public static void main(String[] args) {
		// Declare, Create, and Initialize an array of points
		double points [][] = new double[][] {
			{-1,3},
			{-1,-1},
			{1,1},
			{2,0.5},
			{2,-1},
			{3,3},
			{4,2},
			{4,-0.5}
		};
	
		FindNearestPointSets(points);
		
	}
		
		/* Find the distance between each set of points **/
		public static void FindNearestPointSets(double [][] pointSet)  {
			double [] distance = new double [pointSet.length];
			for (int i = 0; i < pointSet.length - 1; i++)
				distance[i] = Math.sqrt((Math.pow((pointSet[i+1][0] - pointSet[i][0]),2) 
							  + Math.pow((pointSet[i+1][1] - pointSet[i][1]), 2))); 
	
			// Find the minimum distance between each set of points
			double minimumDistance = 1.7976931348623157E308;
			double[] minimumPoint1 = {2};
			double[] minimumPoint2 = {2};
			for (int i = 1; i < pointSet.length - 1; i++ )	
				if (distance[i] < minimumDistance) {
					minimumDistance = distance [i];
					minimumPoint1 = pointSet[i];
					minimumPoint2 = pointSet[i + 1];
				}
			
			// Display results
			NumberFormat formatter = new DecimalFormat("#0.00");
			System.out.println("The two sets of points that are "
					+ "closest to eachother are " + Arrays.toString(minimumPoint1) 
					+ " and " + Arrays.toString(minimumPoint2) + ".");
			System.out.println();
			System.out.println("The distance between the two points is " + formatter.format(minimumDistance) + ".");
		}
}

