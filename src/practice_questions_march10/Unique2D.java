/*
 * Write a program to read 2D array as input which contains only unique elements,
 *  then replace max element’s position with min element’s position.
		Input :
				1 2 3
				4 5 6
				7 8 9
		Output :
				9 2 3
				4 5 6
				7 8 1
 */

/*+++++pseudo code++++++
 * take input from user and check all nos are unique
 * find min element and position of the element
 * find max element and pos of the element
 * swap the min & max elemete with the same postion
 * disply matrix
 */
package practice_questions_march10;

import java.util.Scanner;

public class Unique2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix:");
		int size = sc.nextInt();
		int[][] mat = new int[size][size];

		System.out.println("Enter the element for matrix");

		// int[][] mat = { { 1, 2, 3 }, { 4, 9, 6 }, { 5, 8, 7 } };

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		boolean isUnique = uniqueElements(mat, size);

		if (isUnique) {
			int[] min = new int[3];
			int[] max = new int[3];

			min = findMin(mat, min, size);
			// showArray(min);
			max = findMax(mat, max, size);
			// showArray(max);

			mat = swapMat(min, max, mat);

			showMat(mat, size);
			
			mergedInArray(mat,size);
			
		//	showMat(mat, size);

		} else
			System.out.print("The elemensts are not unique");
	}

	private static void mergedInArray(int[][] mat, int size) {
		// TODO Auto-generated method stub
		int[] arr = new int[size*size];
		int p =0;
		for(int i =0; i < size; i++)
		{
			for(int j =0; j < size; j++)
			{
				arr[p] = mat[i][j];
				p++;
			}
		}
		
		for(int i =0; i < arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		
	}

	private static boolean uniqueElements(int[][] mat, int size) {
		// TODO Auto-generated method stub
		int count;
		for (int p = 0; p < size; p++) {
			for (int q = 0; q < size; q++) {
				int key = mat[p][q];
				count = 0;

				for (int i = 0; i < size; i++) {

					for (int j = 0; j < size; j++) {

						if (key == mat[i][j]) {
							count++;
						}
					}
					// System.out.println(count);
					if (count > 1) {
						return false;
					}
				}
			}
		}

		return true;
	}

	private static void showMat(int[][] mat, int size) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(mat[i][j] + " ");
			}
			 System.out.println();
		}
	}

	private static int[][] swapMat(int[] min, int[] max, int[][] mat) {
		// TODO Auto-generated method stub
		int temp = min[0];

		mat[max[1]][max[2]] = min[0];
		mat[min[1]][min[2]] = max[0];

		return mat;
	}

	// for personal use
	private static void showArray(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static int[] findMax(int[][] mat, int[] max, int size) {
		// TODO Auto-generated method stub
		System.out.println("Inside Max funct");
		int key = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (mat[i][j] > key) {
					key = mat[i][j];
					max[0] = key;
					max[1] = i;
					max[2] = j;
				}
			}
		}

		// System.out.println(key);

		return max;
	}

	private static int[] findMin(int[][] mat, int[] min, int size) {
		// TODO Auto-generated method stub
		System.out.println("Inside min funct");
		int key = mat[0][0];
		// int minI=0, minJ=0;

		// {1, 2, 3},{ 4, 5, 6},{ 7, 8, 9}};
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (mat[i][j] <= key) {
					key = mat[i][j];
					min[0] = key;
					min[1] = i;
					min[2] = j;
				}
			}
		}
		// showArray(min);
		// System.out.println(min[0]);
		return min;

	}

}
