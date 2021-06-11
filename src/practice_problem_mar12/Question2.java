/*
 * Given two input alphanumeric strings, write a program to segregate 
 * the strings into two separate strings with numbers in 1st string and characters 
 * in 2nd string removing duplicates. 
 * 
	Example:
		Input:
		String1 = Wel123come, String2 = 2Goodbye45
		Output:
		String1 = 12345, String2 = WelcomGdby
 */
/*
 * ++++pseudo code+++++++++
 * take input as a num and letters combine 2 times
 * create method for get all numbers from both string 
 * create method for get all letters from both string
 * retun the gettNumbers method to string1 
 * return all letters in string 2 by calling getWords method
 * display the result;
 */
package practice_problem_mar12;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string1 with num and letters: ");
		String str1 = "Wel123come";//sc.next();

		System.out.println("Enter the string2 with num and letters: ");
		String str2 = "2Goodbye45";//sc.next();

		String numbers = "";
		numbers = getNumbers(str1, numbers);
		numbers = getNumbers(str2, numbers);
		
		System.out.println(numbers);
		
		String word = "";
		  word = getWord(str1,word);
		  word = getWord(str2,word);
		  System.out.println(word);
		

	}

	//return all alphabets from both string
	private static String getWord(String str, String word) {
		// TODO Auto-generated method stub
    String word1 = word;
		
		for(int i =0; i < str.length();i++)
		{
			boolean isRepeat = false;
			if(str.charAt(i) <= 'Z' && str.charAt(i) >= 'A'
					|| str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				for(int m=0; m < word1.length();m++)
				{
					if(word1.charAt(m) == str.charAt(i))
					{
						isRepeat = true;
					}
				}
				
				if(!isRepeat)
				{
					word1 +=str.charAt(i);
				}
			}
		}
		return word1;
	}

	private static String getNumbers(String str, String numbers) {
		// TODO Auto-generated method stub
		String num = numbers;
		
		for(int i =0; i < str.length();i++)
		{
			boolean isRepeat = false;
			if(str.charAt(i) <= '9')
			{
				for(int m=0; m < num.length();m++)
				{
					if(num.charAt(m) == str.charAt(i))
					{
						isRepeat = true;
					}
				}
				
				if(!isRepeat)
				{
					num +=str.charAt(i);
				}
			}
		}
		
		return num;
	}

}
