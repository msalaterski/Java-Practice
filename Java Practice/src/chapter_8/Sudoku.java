package chapter_8;

import java.util.Scanner;

public class Sudoku {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the number of blocks of the puzzle
		System.out.print("Please enter the number of blocks (must be a multiple of 3) you would like for the Sudoku puzzle: ");
		
		// Declare arrays
		final int rows = input.nextInt();
		final int columns = rows;
		
		int [][] puzzle = new int[rows][columns];
		int [][] blocks = new int[rows][columns];
		
		// Generate random values for the Sudoku puzzle
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; i++)
				puzzle[i][j] = (int)Math.random() * 10;
		
		for (int i = 0; i < rows/3; i++) // block
			for (int j = (3 * i; j < (3 * (i+1)); j++) // row within block
				for int (k = 0, k < 3; k++) // column within row within block
					blocks[j][k] = puzzle 
					
//blocks[0][0] = puzzle[0][0], blocks[0][1] = puzzle[0][1], blocks[0][2] = puzzle[0][2],
//blocks[0][3] = puzzle[1][0], blocks[0][4] = puzzle[1][1], blocks[0][5] = puzzle[1][2],
//blocks[0][6] = puzzle[2][0], blocks[0][7] = puzzle[2][1], blocks[0][8] = puzzle[2][2]
				
//block [1] = puzzle[0][3], puzzle[0][4], puzzle[0][5],
//			  puzzle[1][3], puzzle[1][4], puzzle[1][5],
//			  puzzle[2][3], puzzle[2][4], puzzle[2][5]				
		
		

	}

}
