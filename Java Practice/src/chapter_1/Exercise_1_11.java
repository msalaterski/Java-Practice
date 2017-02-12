package chapter_1;

public class Exercise_1_11 {
	public static void main(String[] args) {
		//Declarations
		int population = 312032486;
		double birthsPerYear = 31536000 / 7;
		double deathsPerYear = 31536000 / 13;
		double immigrantsPerYear = 31536000 / 45;
		//Calculating new population after 5 years
		for (int i = 0; i < 6; i++) {
			population += birthsPerYear + immigrantsPerYear - deathsPerYear;
		}
		//Display new population after 5 years
		System.out.println(population);
	}
}
