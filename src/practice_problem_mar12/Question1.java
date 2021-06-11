/*
 * Write a program to read sentence as an user input and find the number of 
   occurrence of a given string in the sentence.(Ignore the case sensitive) 
	Input : "Today is Sunday, Its holiday"
	Substring : Day
	Output : 3
 */
/*++++++pseudo code++++++++
 * take input string from user 
 * take another input from user to search a substring in the sentace 
 * create a method for substring 
 * return the count and display the result
 */

package practice_problem_mar12;

import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the Sentance:");
		String mainStr = "Today is Sunday, Its holi";//sc.nextLine();
		
		
	//	System.out.println("Enter the word to find:");
		String toFind = "day";//sc.nextLine();
	
		int total = subString(mainStr, toFind);
		
		System.out.println(total);

	}

	private static int subString(String mainStr, String toFind) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int i =0; i < mainStr.length();i++)
		{
			String s= "";
			int j =0;
			if(mainStr.charAt(i) == toFind.charAt(j) ) //|| mainStr.charAt(i) == toFind.charAt(j)
			{
				int add = i;
				for(int p =0; p < 3; p++)
				{
					s += mainStr.charAt(add);
					add++;
				}
			}
			if(s.equals(toFind))
			{
				count++;
			}
			
		}
		return count;
	}

}
