/*
 * 	Write a program which take some fruits name as an input array and using binary search verify the given
	fruit is there or not.
	Input Validations:
	String to be verified (second input) should be in lowercase and it should not be Alphanumeric
	Example1:
		Input1: {apple, mango, banana}
		Input2: mango
		Output: Yes
	Example2:
		Input1: {apple, MANGO, banana}
		Input2: mango
		Output: No	
 */

/*++++++++pseudo code+++++++
 * take user input for no of fruits in array.
 * assign this no as a size of array 
 * take input one by one from user for fruits string 
 * 
 * creaye separte method for traversing through array with case egnore
 * ask user to find the word 
 * check if the word is exist or not;
 * 
 */
package practice_questions_march10;

import java.util.*;

public class StringArray {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the no. of fruits:");
		//test 3;
		int size = sc.nextInt();
		
		//test:  {"mango", "apple", "banana"};
		String[] fruits = new String[size];
		
		fruits = readData(fruits,size);
		
//		StringBuffer sbf = new StringBuffer(Arrays.toString(fruits));
//		System.out.println(sbf);
		
		for(String i : fruits)
			System.out.print(i+ ", ");
		
		String isfound = searchArray(fruits);
		System.out.println(isfound);
		

	}

	private static String searchArray(String[] fruits) {
		// TODO Auto-generated method stub
		System.out.println("\n"+"Enter te fruit to search:");
		String tofound = sc.next();
		
		for(int i = 0; i < fruits.length;i++)
		{
			if(tofound.equals(fruits[i]))
			{
				return "Yes";
			}
		}
		return "No";
	}

	private static String[] readData(String[] fruits, int size) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Fruits name:");
		for(int i=0; i < size;i++)
		{
			fruits[i] = sc.next();
		}
		
		return fruits;
	}

}
