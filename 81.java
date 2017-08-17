import java.io.*;
import java.util.*;

public class Problem81 {
	/*
	 * Find the minimal path in a matrix by only going down and right. This is a
	 * dynamic programming problem.
	 */

	public static void main(String[] ivy) {
		int[][] matrix;
		Scanner scanner;
		try {
			//Convert the text file into an integer matrix
			scanner = new Scanner(new File("matrix.txt"));
			matrix = new int[80][80];
			int r = 0;
			while (scanner.hasNextLine()) {
				String str = scanner.nextLine();
				matrix[r] = toIntArray(str);
				r++;	
			}
			/* Dynamic Programming part 
			 * 
			 * What we are going to do is to start from the bottom right corner and work our way up.
			 * Since we only have 2 directions this makes the coding easy for us.
			 * The first for loop is us calculating the "edges" of the matrix. That is, the bottom row and right column.
			 * If you are in the bottom, you can only go right, and if you are in the right column, you can only go down.
			 * These are our "base cases". We will calculate these values first by adding up the values.
			 * 
			 * Now that we have our base cases, we can finally calculate the solution. To do this, 
			 * we are going to do a double for-loop and fill in the rest of the solutions for the 
			 * other matrix spaces. This can be done by evaluating which path will yield the minimal
			 * path. We can only go up one row, or down one column. The answer to the current space
			 * will be the minimum of those two spaces (the one under it, or to the right.)
			 * 
			 * This way, the solution will be in the upper left hand corner. 
			 */
			for (int i = 78; i >= 0; i--) { //starting next to the bottom right hand corner. I don't use 2 for loops because this is a square matrix 
				// filling out bottom row, its minimal path solution is just adding itself to its neighbor
				matrix[79][i] += matrix[79][i + 1];
				// filling out the right column, its minimal path solution is the sum of itself and its bottom neighbor
				matrix[i][79] += matrix[i + 1][79];
			}
			
			//going through and working up the solutions
			for (int row = 78; row >= 0; row--) {
				for (int col = 78; col >= 0; col--) {
					//Choose the smallest: the bottom space or the space to the right 
					// This will yield the minimum path sum for the current space.
					matrix[row][col] += Math.min(matrix[row + 1][col], matrix[row][col + 1]);
				}
			}
			System.out.println(matrix[0][0]);

		} catch (FileNotFoundException e) {
			System.out.println("File not Found! Check the address. ");
		}

	}
	
	private static int[] toIntArray(String str) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str.split(",")));
		int[] intArray = new int[list.size()];
		for (int i = 0; i < intArray.length; i++) {
		    intArray[i] = Integer.parseInt(list.get(i));
		}
		return intArray;
	}
}
