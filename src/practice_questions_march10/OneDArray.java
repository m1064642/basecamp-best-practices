/*
 * Question 1 :
Take two 1D arrays as user input and subtract the 1st array from 2nd array .
Create a new array with all the negative numbers from the resultant array
Input:
Array 1 : {10,67,1}
Array 2 : {16,8,90}
Output:
Resultant array {-6,59,-89}
Array with negative numbers {-6,-89}
 */
/*  +++++++psedo code++++++
 * take two integer array from user 
 * size of all the array should be same
 * form a loop to make the iteration to arr.length
 * Do subtraction opertion in a separet method 
 * subtract first elemnt of Array A to first element of seconf array 
 * and so on 
 * save the results in resultant array 
 * display the rsultant array
 */
package practice_questions_march10;

import java.util.Scanner;

public class OneDArray {
	static Scanner sc = new Scanner(System.in);
	static int size =0;

	//String name = new String(" Nikhil");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size of Array A and Array B:  ");
		//test size: 3
		size =sc.nextInt();
		
		//test   {1 ,2, 3};// {5, 4,1};//
		int firstArr[] = new int[size];
		int secondArr[] = new int[size];
		int result[] = new int[size];
		
		firstArr = readElements();
		secondArr = readElements();
		
		result = subtraction(firstArr, secondArr);
		
		for(int p =0; p < result.length;p++)
		{
			System.out.print(result[p]+ " ");
		}
	}

	private static int[] subtraction(int[] firstArr, int[] secondArr) {
		// TODO Auto-generated method stub
		int sub[] = new int[firstArr.length];
		
		for(int i=0; i< firstArr.length;i++)
		{
			sub[i] = firstArr[i] - secondArr[i];
			//System.out.println(sub[i]);
		}
		return sub;
	}

	private static int[] readElements() {
		// TODO Auto-generated method stub
		int []a = new int[size];
		System.out.println("Enter the elements of array:  ");
		for(int i = 0; i < size; i++)
		{
			a[i] = sc.nextInt();
			//System.out.println(arr[i]);
		}
		return a;
	}

}
