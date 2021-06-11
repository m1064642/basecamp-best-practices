/*
 * Question 2 :
Write a program which takes an array of numbers from user and then sort those numbers using
insertion sort and take out prime numbers if it’s there in array.
Note : The prime numbers in subset should also be in sorted manner.
Input: {9,2,89,7,15}
Output: {2,7,9,15,89}
Prime sorted subset array : {2,7,89}
 */
/*++++++++Pseudo code++++++
 * take input from user for size of array
 * assign the input to new array created
 * create method for insertion sort
 * check count of prime no in the same array 
 * display sorted array
 * 
 * create new array with prime numbers 
 * print this array
 */
package practice_questions_march10;

import java.util.Scanner;

public class IntertionSort {
	static int size = 0;

	public static void main(String[] args) {

		System.out.println("Enter the Size of array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		insertionSort(arr);
		System.out.print("\nInsertion Sort Arrat: ");
		showArray(arr);

		int primeCount = countPrimeNo(arr);

		int[] primeArr = primeNo(arr, primeCount);

		System.out.println("\nTotal prime numbers: " + primeCount);

		System.out.print("Prime nos: ");
		showArray(primeArr);
		sc.close();

	}

	private static int[] primeNo(int[] arr, int primeCount) {

		int[] primeArr = new int[primeCount];
		int  p = 0;
		for (int i = 0; i < arr.length; i++) {
			int n = 0;
			for (int j = 1; j < arr[i]; j++) {
				if (((arr[i] % j) == 0) && (arr[i] != 1)) {
					n++;
				}
			}
			if (n == 1) {
				primeArr[p++] = arr[i];
			}
		}

		return primeArr;
	}

	private static int countPrimeNo(int[] arr) {

		// 2 4 7 9 10
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			int n = 0;
			for (int j = 1; j < arr[i]; j++) {
				if ((arr[i] % j) == 0) {

					n++;
				}

			}
			if (n == 1) {
				num += 1;
			}
		}

		return num;
	}

	private static void showArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void insertionSort(int[] arr) {

		System.out.println("Inside insertion sort\n");

		// 5 1 2 6 3 4
		for (int j = 1; j < size; j++) {
			int key = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;

		}

	}

}