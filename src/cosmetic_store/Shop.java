package cosmetic_store;

import java.util.*;

public class Shop {
	static Scanner sc = new Scanner(System.in);
	static int i = 0;
	static Product[] prod; //= new Product[size];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int size = 50;
		//System.out.println(prod.length);

		// getData(prod);
		while (true) {
			System.out.println("1.Dispaly Data");
			System.out.println("2.Add details");
			System.out.println("3.Update details");
			System.out.println("4.Search By Price range");
			System.out.println("5.Search Brand By product ");
			System.out.println("6.Exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1: // display data
				for (int j = 0; j < i; j++) {
					prod[j].display(); // prod[0].getId(),prod[0].getName(),prod[0].getBrand(), prod[0].getQuntity(),
										// prod[0].getPrice()
				}
				break;
			case 2: // Add details
					prod = readData(prod);
				break;
			case 3: // update details
				System.out.println("Enter the product id to update the details");
				int sr = sc.nextInt();
				prod = updateDetails(sr, prod);
				break;
			case 4: // search cosmetic for the given price range and sort cosmatic details by brand
					// and show details

				queryRes_by_ranges(prod);

				break;
			case 5: // search all available brands for given cosmatic name and display details
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter valid options from 1-6");
			}
		}
		//

	}

	private static void queryRes_by_ranges(Product[] prod) {
		// TODO Auto-generated method stub
		System.out.println("Enter the ranges from lower to higher: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Product tempProd[] = new Product[prod.length];
		for (int p = 0; p < prod.length; p++) {
			int count = 0;

			if (prod[p].price >= n1 && prod[p].price <= n2) {
				tempProd[count] = prod[p];
				count++;
			}
		}

		// Sort the temporary array by brand

		for (int p = 0; p < tempProd.length; p++) {
			for (int q = p + 1; q < tempProd.length; q++) {
				if (tempProd[p].brand.compareTo(tempProd[q].brand) > 0) {
					Product temp = tempProd[p];
					tempProd[p] = tempProd[q];
					tempProd[q] = temp;
				}
			}

		}
		for (int p = 0; p < tempProd.length; p++) {
			tempProd[p].display();
		}
	}

	private static Product[] updateDetails(int sr, Product[] prod) {
		// TODO Auto-generated method stub

		boolean isFound = false;
		
		for (int p = 0; p < prod.length; p++) {
			if (prod[p].id == sr) {
				System.out.println("Enter the new quntity: ");
				int q = sc.nextInt();

				prod[p].quntity = q;
				System.out.println("Details updated successfully.....");

				isFound = true;
				prod[p].display();
				break;
			}
		}
		
		if(isFound)
			return prod;
		
		
		System.out.println("Sorry item not found");
		return prod;
	}

	private static Product[] readData(Product[] prod) {
		// TODO Auto-generated method stub
		int size = ++i;
		
		System.out.println("Enter the product Id");
		long id = sc.nextLong();
		System.out.println("Enter the product name");
		String name = sc.next();
		System.out.println("Enter the product brand");
		String brand = sc.next();
		System.out.println("Enter the product quntity");
		int quntity = sc.nextInt();
		System.out.println("Enter the product price");
		float price = sc.nextFloat();

		Product[] temp = new Product[size];
		
		for(int j =0; j < i-1;j++)
			temp[j] = prod[j];
			
		 temp[size-1] = new Product(id, name, brand, quntity, price);
		
		return temp;

	}

}
