import java.util.Scanner;

/**
 * 
 */

/**
 * @author M1064642
 *
 *         [2:26 PM] Mohd Shadab Hussain Write a program to take a sentence as
 *         an input and swap 1st word and last word and reverse the characters
 *         of these words. Traverse remaining words and change the vowels to
 *         next character and change its case. Note: Splitting of words should
 *         be based on unser input(special characters).
 *         
 *         Example1 : input
 *        	 welcome_to_java_programming 
 *        	 Split char: _ After Splitting: welcome to java programming 
 *        	output gnimmargorp tP jBvB emoclew
 *        
 *         Example 2 : input
 *        	 tommorrow,will,bE,holiday
 *        	 Split char: , After Splitting: tommorrow will be holiday 
 *        	 output:- yadiloh wJll bf worrommot
 * 
 * 
 */
/*
 * ++++++pseudo code+++++++
 * 
 * take inputr string from user
 * pass this string to getWord method so that string wll be convert into Strinf array
 * now pass this array to requirement method
 * now put the first elemt in the last of new array with reverse the char and vice versa
 * now iterate through remaiing index
 * if the char is vowel then increment the char by 1 with -32
 * return this array and pruint on console
 */
public class Live2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();//"welcome_to_java_programming";
		
		String[] words = null;
		
		words = getWords(words,str);
		
		System.out.println("After Splitting:");
		
		for(int i =0; i < words.length;i++)
			System.out.print(words[i]+", ");
		
		System.out.println();
		
		String[] requirement = null;
		
		requirement = getModified(words);
		
		
		for(String i : requirement)
			System.out.println(i);

	}
	
	private static String[] getModified(String[] words) {
		// TODO Auto-generated method stub
		
		String[] temp = new String[words.length];
		
		char s;
		String w = "";
		
		for(int j = words[words.length-1].length()-1;j>=0;j--)
		{
			s = words[words.length-1].charAt(j);
			w += s;
		}
		
		temp[0] = w;
		
		for(int p =1; p < words.length-1;p++ )
		{
			w="";
			char c;
			
			for(int a=0; a< words[p].length(); a++)
			{
				if(words[p].charAt(a) == 'a'||words[p].charAt(a) == 'e'||words[p].charAt(a) == 'i'||words[p].charAt(a) == 'o'||words[p].charAt(a) == 'u')
				{
					c= (char) ( words[p].charAt(a)-32 );
					w += ++c;
				}else if(words[p].charAt(a) == 'A'||words[p].charAt(a) == 'E'||words[p].charAt(a) == 'I'||words[p].charAt(a) == 'O'||words[p].charAt(a) == 'U')
				{
					c = (char) (words[p].charAt(a) + 32);
					w += ++c;
				}
				else
				{
					c= words[p].charAt(a);
					w += c;
				}
			}
			
			temp[p] =w;
		}
		
		s =' ';
		w= "";
		
			for(int j =words[0].length()-1; j >=0;j--)
			{
				s = words[0].charAt(j);
				 w+= s;
			}
			temp[words.length-1] =w;
			
		
		return temp;
	}

	private static String[] getWords(String[] words, String str) {
		// TODO Auto-generated method stub
		int space = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == '#' ) || (str.charAt(i) <= '@'))
				space++;
		}
		// define the string array with +1 space
		String arr[] = new String[space + 1];
		String nstr = "";

		// create words
		for (int i = 0, j = 0; i < str.length(); i++) {
			if (str.charAt(i) == '#' || (str.charAt(i) <= '@')) {
				arr[j] = nstr;
				j++;
				nstr = "";
			} else {
				nstr = nstr + str.charAt(i);
			}
			arr[j] = nstr;
		}

		return arr;
	}


}
