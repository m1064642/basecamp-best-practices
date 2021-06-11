import java.util.Scanner;

public class DynamicArrays {

	static int size = 0;
	static int[] arr;// = new int[5];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main arr: ");

		System.out.println("enter the size :");
		int p = sc.nextInt();
		for (int i = 0; i < p; i++)
			arr = takeIn(arr);

		System.out.println("main arr: " + arr.length);
		//arr = takeIn(arr);
		for (int i : arr)
			System.out.println(i);
		
		arr = delete();
		
		System.out.println("deleted arr: " + arr.length);
		//arr = takeIn(arr);
		for (int i : arr)
			System.out.println(i);
	}

	private static int[] delete() {
		// TODO Auto-generated method stub
		System.out.println("enter the number to delete");
		int d = sc.nextInt();
		
		int[] temp= new int[arr.length-1];
		for(int i =0,j=0; i < size; i++)
		{
			if(arr[i] == d)
			{
				continue;
			}else
			{
				temp[j] = arr[i];
				j++;
			}
		}
		return temp;
	}

	private static int[] takeIn(int[] newarr) {
		// TODO Auto-generated method stub
		System.out.println("Enter the elements: ");

		int newSize = ++size;

		int a = sc.nextInt();

		int[] temp = new int[newSize];
		for (int i = 0; i < size - 1; i++)
			temp[i] = newarr[i];

		temp[newSize - 1] = a;
		arr = temp;
		return temp;
	}

}
