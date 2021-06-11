import java.util.Scanner;

/*
 * Write a program to read sentence with two words as an user 
 * input and swap both the words ignoring the letters which are common in both the words.
 *   Return an error message if sentence contains more than 2 words
	Example:
	Input:  “Hello World”
	Output: Wrd He
 */
public class CodingChallengeMar25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "Hello WOrld";//sc.nextLine();

		 s = requirement(s);
		System.out.println(s);
		
		String[] words = null;
		getWords(words,s);
		
		for(int i= 1; i >=0;i--)
			System.out.print(words[i]+ " ");

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

		
	private static String requirement(String s) {
		// TODO Auto-generated method stub
		
		String  newStr ="";
		
		for(int i =0; i <s.length();i++)
		{
			char c = s.charAt(i);
			int n=0;
			for(int j = 0; j < s.length(); j++)
			{
				if(c == s.charAt(j) || c == (char)(s.charAt(j)-32) 
						|| c == (char)(s.charAt(j) +32))
					n++;
			}
			
			if(n == 1)
			{	newStr += c;
				//System.out.print(c);
			}
		}
		
		return newStr;
	}

	
}
