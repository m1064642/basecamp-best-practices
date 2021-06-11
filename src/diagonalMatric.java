import java.util.Scanner;

/*
 * Create a 2D matrix n*n (User Input) . WAP to reverse the diagonal elements and
 *  square the other elements in the matrix.

Eg (input)- 
		1 2 3
		4 5 6
		7 8 9

Output - 
		9 4 7
		16 5 36
		3 64 1
		
		+++++++++++psedu code+++++++++++++
		1. read data from user
		2. reversed the diagonal part only and return the matrix
		3. now squared the rest of the element which is not a part of diagoanl in the matrix 
		5. show on console
 */
public class diagonalMatric {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter the sized of the matrix");
		int size = sc.nextInt();

		int[][] matrix = new int[size][size];

		matrix = readData(matrix, size);
		System.out.println("Input matrix with size : " + matrix.length);
		display(matrix);

		int[][] reverse = getReveredDiagonal(matrix);
		System.out.println("reversed Diagonal Matrix :");
		display(reverse);

		int[][] squared = getSquareOfElement(reverse);
		System.out.println("Squared elements Matrix :");
		display(reverse);

	}

	private static int[][] getSquareOfElement(int[][] reverse) {

		for (int i = 0; i < reverse.length; i++) {
			for (int j = 0; j < reverse.length; j++) {
				if (i != j && i != reverse.length - j - 1) {
					reverse[i][j] *= reverse[i][j];
				}
			}
		}
		return reverse;
	}

	private static void display(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

	}

	private static int[][] getReveredDiagonal(int[][] matrix) {

		int i = 0, j = matrix.length;
		int temp = 0;

		while (i < j) {

			temp = matrix[i][i];
			matrix[i][i] = matrix[j - 1][j - 1];
			matrix[j - 1][j - 1] = temp;

			temp = matrix[i][j - 1];
			matrix[i][j - 1] = matrix[j - 1][i];
			matrix[j - 1][i] = temp;

			i++;
			j--;
		}

		return matrix;
	}

	private static int[][] readData(int[][] matrix, int size) {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}

}
