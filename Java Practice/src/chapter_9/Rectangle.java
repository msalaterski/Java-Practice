package chapter_9;

public class Rectangle {
	
	// Set default member values for Rectangle
	double width = 1;
	double height = 1;
	
	// No-Arg Constructor for Rectangle
	Rectangle() {
	}
	
	// Constructor specifying width and height of Rectangle object
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}	
	
	// Return the area of the Rectangle object
	double getArea(){
		return width * height;
	}
	
	// Return the perimeter of the Rectangle object.
	double getPerimeter(){
		return width * 2 + height * 2;
	}
	
	
}
