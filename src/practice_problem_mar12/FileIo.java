package practice_problem_mar12;

import java.io.*;
import java.util.Scanner;

public class FileIo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 FileInputStream in = new FileInputStream("C:\\\\Users\\\\M1064642\\\\eclipse-workspace\\\\MindTree Hands-On\\\\src\\\\practice_problem_mar12\\\\input.txt");
		String path = "C:\\Users\\M1064642\\eclipse-workspace\\MindTree Hands-On\\src\\practice_problem_mar12\\output.txt";
		File f = new File(path);
		f.createNewFile();
	

		String str = "I am cool";
		FileOutputStream out = new FileOutputStream(path);
		int s;
		while ((s = in.read()) != -1) {
			// System.out.println(str);

			out.write(s);
			System.out.print(s + " ");
		}
	}

}
