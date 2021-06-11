package excel_csv_operation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVFileReader {

	public static void main(String[] args) throws FileNotFoundException {
		
		//("C:\\Users\\M1064642\\eclipse-workspace\\MindTree Hands-On\\src\\excel_csv_operation\\csvData.csv");
		File csvfile = new File("C:\\Users\\M1064642\\Desktop\\adobe\\Projects\\csv\\page4.csv");
		BufferedReader bfr = new BufferedReader(new FileReader(csvfile));
		String line = "";
		
		List<Object[]> list = new ArrayList<Object[]>();
		String[] count = null; 
		int i =0;
		try {
			while((line = bfr.readLine()) != null) {
				
				count = line.split(",");
//					Object[] obj =null;
//					
//					for(int i =0; i < count.length;i++)
//					{
//						obj[i] = count[i];
//					}
			if(i != 0) {
				
				for(int j =0; j < count.length;j++)
					System.out.println(count[j]);
				System.out.println();
			}
				i++;
				//	list.add(obj);
			}
			
	//		System.out.print(count+ "\t");
			
			//list.forEach(System.out::println);
//		for(int i =0; i < count.length;i++)
//			System.out.println(count[i]);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
