import java.util.Arrays;
import java.util.Scanner;

/*
 * Write a program to print even position words as reversed order 
  and odd position words as next character.

	Sample input : Orchard is best place

	Sample output psdibse SI cftu ECALP
 */
/*
 * 
 */
/*
 * +++++pseudo code++++++++++
 * take input from user
 * pass the string to a user defined method 
 * convert the string into array and return the same array
 * then pass to printing method to print the output according to requirement
 */
public class Live {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();// "orchard is best place";

		// initialize string array
		String[] words = null;

		// get the string array
		words = getWords(words, str);

		// just for quick outout
//		StringBuffer sbf =new StringBuffer(Arrays.toString(words));
//		System.out.println(sbf+"\n");

		modify(words);

	}

	private static void modify(String[] words) {
		// TODO Auto-generated method stub
		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 0) {
				String s = words[i];
				for (int j = 0; j < s.length(); j++) {
					char c = s.charAt(j);
					System.out.print(++c);
				}
			} else {
				String s = words[i];
				for (int j = s.length() - 1; j >= 0; j--) {
					char c = (char) ((s.charAt(j)) - 32);
					System.out.print(c);
				}
			}
			System.out.print(" ");
		}

	}

	private static String[] getWords(String[] words, String str) {
		// TODO Auto-generated method stub
		int space = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				space++;
		}
		// define the string array with +1 space
		String arr[] = new String[space + 1];
		String nstr = "";

		// create words
		for (int i = 0, j = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
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