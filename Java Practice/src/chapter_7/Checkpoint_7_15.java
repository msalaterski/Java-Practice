package chapter_7;

public class Checkpoint_7_15 {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 5, 4};

		  for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
		    // Swap list[i] with list[j]
		    int temp = list[i];
		    list[i] = list[j];
		    list[j] = temp;
		  }
	
		  for (int i: list)
		  System.out.print(i + " ");
	}

}
