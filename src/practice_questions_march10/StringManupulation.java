/*
 * Question 4 :
Take sentence as an user input and find the vowels in the sentence and replace the next consonant 
letter of the vowels with its next ASCII character.
Example1: 
Input: I am good boy
Output: I an gooe boz
Example2: 
Input: I an gooe boz
Output: I ao goof boa

+++++++++psedu code++++++++

take input from user 
convert it into char array without using toCharArray()  func
count char in the string n assign to new char array  as a size
iterate from the char array and check the vowels in the array 
if it is vowel replace it with next char.
display the result
 */

package practice_questions_march10;

import java.util.Scanner;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentance:  ");

		// "i an gooe boz";
		String str = sc.nextLine();

		// System.out.println(str.length());
		char[] chars = new char[str.length()];

		chars = getCharArray(chars, str);

		chars = requiredOut(chars);

		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}

	}

	private static char[] requiredOut(char[] chars) {
		// TODO Auto-generated method stub
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'
					|| chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U'
					|| chars[i] == ' ' || chars[i - 1] == ' ') {

				continue;
			}

			if (chars[i] == 'z') {
				chars[i] = 'a';
			} else
				chars[i]++;
		}

		return chars;
	}

	private static char[] getCharArray(char[] chars, String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			chars[i] = str.charAt(i);
		}

		return chars;
	}

}
