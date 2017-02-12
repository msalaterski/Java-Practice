package chapter_9;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random randomNumber = new Random(1000);
		
		for (int i = 0; i < 50; i++)
			System.out.println(randomNumber.nextInt(101));
	}

}
