/*
 * 5 4 3 2 1
	4 3 2 1
	3 2 1
	2 1
	1
 */
public class PatternCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =0,j =0;
		for(i =5; i >= 1;i--)
		{
			for(j = i; j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
