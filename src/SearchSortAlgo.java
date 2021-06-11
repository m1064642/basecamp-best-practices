import java.util.Scanner;

public class SearchSortAlgo {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Enter the no of vegetables");
		int size1 = sc.nextInt();
		String[] veg = new String[size1];
		
		System.out.println("Enter names of vegetables");
		veg = takeInput(size1, veg);
		display(veg);
		
		System.out.println("Enter the no of fruits");
		int size2 = sc.nextInt();
		String[] fruits= new String[size2];
		
		System.out.println("Enter names of fruits");
		fruits = takeInput(size2, fruits);
		display(fruits);
		
		System.out.println("Bubble sorting...");
		String[] newVeg = bubbleSort(veg);
		display(newVeg);
		
		System.out.println("Insertion sorting...");
		String[] newFruits = insertionSort(fruits);
		display(newFruits);
		
		System.out.println("Linear searching...");
		int fruitIndex = linearSearch(fruits);
		System.out.print("   Item found at index: " + fruitIndex);
		System.out.println();
		
		System.out.println("Binary searching...");
		int vegIndex = binarySearch(veg);
		System.out.print("   Item found at index: " + vegIndex);
		
		String[] merged = new String[size1  + size2];
		mergedArray(veg, fruits, merged);
	}

	private static void mergedArray(String[] veg, String[] fruits, String[] merged) {
		// TODO Auto-generated method stub
		for(int i =0,j =0; i < merged.length; i++)
		{
			if(i < veg.length)
			{
				merged[i] = veg[i];
			}else
			{
				merged[i] = fruits[j];
				j++;
			}
		}
		
		display(merged);
	}

	private static void display(String[] arr) {
		// TODO Auto-generated method stub
		System.out.print("[");
		for(String i : arr)
			System.out.print(""+i + ", ");
		
		System.out.println("]");
		System.out.println();
	}

	private static int binarySearch(String[] veg) {
		// TODO Auto-generated method stub
		System.out.println("Enter the vegitable to search: ");
		String item = sc.next();

		int mid;
		int beg = 0;
		int end = veg.length - 1;

		while (beg <= end) {
			mid = (beg + end) / 2;

			System.out.println(veg[mid].compareTo(item));
			
			if (veg[mid].compareTo(item) < 0) {
				beg = mid + 1;
			} else if (veg[mid].compareTo(item) > 0) {
				end = mid - 1;
			} else {
				System.out.println("found!: " + item);
				return mid;
			}
		}

		return -1;
	}

	private static int linearSearch(String[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Enter the fruit to search: ");
		String item = sc.next();

		int index =0;
		for(int i =0; i < arr.length;i++)
		{
			if(item.equals(arr[i]))
			{
				System.out.println("found!: "+ item);
				return (i);
			}
		}
		return -1;
	}

	private static String[] insertionSort(String[] arr) {
		// TODO Auto-generated method stub
//
//		String temp = "";
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i].compareTo(arr[j]) > 0) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		   int n = arr.length;  
	        for (int j = 1; j < n; j++) {  
	            String key = arr[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( arr[i].compareTo(key) > 0 )) {  
	            	arr [i+1] = arr [i];  
	                i--;  
	            }  
	            arr[i+1] = key;  
	        }
		return arr;
	}

	private static String[] bubbleSort(String[] arr) {
		// TODO Auto-generated method stub
		String temp= "";
		for(int i =0; i < arr.length;i++)
		{
			for(int j=i+1; j < arr.length;j++)
			{
				if(arr[i].compareTo(arr[j]) >= 0)
				{
					temp = arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
				}
			}
		}
		//display(arr);
		return arr;
	}

	private static String[] takeInput(int size, String[] arr) {
		// TODO Auto-generated method stub
		
		for(int i =0; i < size; i++)
		{
			arr[i] = sc.next();
		}
		return arr;
	}

}
