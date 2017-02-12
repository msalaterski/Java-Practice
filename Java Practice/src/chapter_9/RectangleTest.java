package chapter_9;

public class RectangleTest {

	public static void main(String[] args) {

		//Create Rectangle object r1 with width 4 and height 40
		Rectangle r1 = new Rectangle(4,40);
		
		//Create Rectangle object r2 with width 3.5 and height 35.9
		Rectangle r2 = new Rectangle(3.5,35.9);
		
		System.out.println(r1.width + ", " + r1.height + ", " + r1.getArea() + ", " + r1.getPerimeter());
		System.out.println(r2.width + ", " + r2.height + ", " + r2.getArea() + ", " + r2.getPerimeter());
	}

}
