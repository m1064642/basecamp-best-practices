/*
 * Write a programm which reads a sentance as an input and perform below changes 
 * a.First word as it is
 * b.Last word converted to its first and last letter and also covert to capital letter 
 * c.Rest all words should be replaced with next letter 
 * d.indexOf(), charAt(), cpmparesTo(), equals() and length() 
 * 
 *  sample input 1: today is good day
 *  sample output 1: today jt b hppe DY
 * */

package string_Manipulation;

import java.util.*;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	while(true) {
		int index = 0;
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char ch[] = new char[str.length()];
		
		for(int i = 0;i<str.length();i++)
		{
			ch[i] = str.charAt(i);
		}
		
		
		//first word as it is
		String first =""; 
		first = first +ch[0];
		for(int i =1;i <ch.length;i++)
		{
			if(ch[i] !=' ')
			{
				first +=ch[i];
			}else
			{	index = i;
				break;
			}
		}
		
		System.out.print(first+" ");
		
      //  
		//last word:- first letter + last letter is into upper case
        String last = "";
        int ind=0;
        for(int i = ch.length-1; i>=0;i--)
        {
        	if(ch[i]==' ') {
        		ind = ++i;
        		char p = (char) (ch[ind]-32);
        		last += p;
        		
        		p =  (char) (ch[ch.length-1] -32);
        		last += p;
        		break;
        	}
        }
       // System.out.println(last);
        
        //middle word is increse by 1 by its char value
        display(ch,index, last, ind);
        
	}
}

	private static void display(char[] ch, int n, String s, int l) {
		// TODO Auto-generated method stub
		int len = ch.length;
		int temp = n;
		
		for(int i = n; i<l;i++)
		{
			if(ch[i] == ' ')
			{	temp = i;
				System.out.print(ch[i]);
			}else
				System.out.print(++ch[i]);
		}
		System.out.print(s);
	}
}
