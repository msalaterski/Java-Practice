package chapter_9;

public class FanTest {

	public static void main(String[] args) {
		// Create first fan
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.turnOn();
		fan1.setName("fan1");
		
		// Create second fan
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.turnOff();
		fan2.setName("fan2");

		// Display Results
		System.out.println(Fan.toString(fan1));
		System.out.println();
		System.out.println(Fan.toString(fan2));
	}

}
