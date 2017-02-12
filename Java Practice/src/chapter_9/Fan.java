package chapter_9;

public class Fan {
	
	// Declare contants
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	
	// Declare variables
	private String name;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	// Getter Methods
	public int getSpeed() {
		return this.speed;
	}
	public boolean isOn() {
		return this.on;
	}
	public double getRadius() {
		return this.radius;
	}
	public String getColor() {
		return this.color;
	}
	public String getName() {
		return this.name;
	}
	
	// Setter Methods
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void turnOn() {
		this.on = true;
	}
	public void turnOff() {
		this.on = false;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Default no-arg constructor
	Fan() {
	}
	
	// Return String description for the Fan object
	public static String toString(Fan fan) {
		if (fan.isOn() == true) {
			String onText = "Fan speed for " + fan.getName() + " is " + fan.getSpeed() + ", "
						  + "fan color is " + fan.getColor() + ", "
						  + "and fan radius is " + fan.getRadius() + ".";
			return onText;
		}
		else {
			String offText = fan.getName() + " is off.";
			return offText;
		}
	}
}
