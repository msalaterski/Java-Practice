package chapter_2;

public class ComputeArea {
	public static void main(String[] args) {
	double radius; // Declare Radius
	double area; // Declare Area
	
	// Assign a radius
	radius = 20; //radius is now 20
	
	// Compute Area
	area = radius * radius * Math.PI;
	
	// Display Results
	System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}
