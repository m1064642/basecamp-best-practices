package medical_store;

import java.util.Scanner;

public class MedicalStoreApplication {
	static Scanner sc = new Scanner(System.in);
	static int noOfPeople = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = true, isfirstTime = false;
//		System.out.print("Enter the no of customer: ");
//		
//		
//		int noOfPeople = sc.nextInt();
//		
		Customer[] customers = null; // new Customer[noOfPeople];
		Medicine[] medicines = null;

		// customers = createCustomer(customers, medicines,isfirstTime);
		do {
			int choice = displayMenu();

			switch (choice) {
			case 1:

				if (customers == null) {
					System.out.println("There are no records available");
				} else {

					for (int m = 0; m < customers.length; m++) {
						displayDetails(customers, m);
					}
				}
				break;

			case 2:
				createCustomer(customers, medicines, true);
				break;
			case 3:
				sortCustomerArray(customers, medicines);
				break;
			case 4:
				deleteMedicineByCustomer(customers, medicines);
				break;
			case 5:
				System.out.println("<Thank You>");
				flag = false;

			}

		} while (flag);

	}

	private static void deleteMedicineByCustomer(Customer[] customers, Medicine[] medicines) {
		// TODO Auto-generated method stub
		System.out.println("Enter the customer id to delete:");
		int deleteId = sc.nextInt();
		boolean isFound = false;

		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getId() == deleteId) {
				isFound = true;
				Medicine[] med = new Medicine[(customers[i].getMedicines().length) - 1];
				System.out.println("Enter the name of medicine: ");
				String deleteName = sc.next();

				for (int p = 0, q = 0; p < customers[i].getMedicines().length; p++) {
					Medicine[] tempMedicin = customers[i].getMedicines();

					if (deleteName.equals(tempMedicin[p].getMedName())) {
						p++;
					}
					med[q] = tempMedicin[p];
					q++;
				}
				System.out.println("deleted");
				customers[i].setMedicines(med);
				break;
			}
		}

		if (!isFound) {
			System.out.println("Customer not found......");
			deleteMedicineByCustomer(customers, medicines);
		}

	}

	private static void sortCustomerArray(Customer[] customers, Medicine[] medicines) {

		Customer temp ;//= new Customer();

		Customer[] sorted = new Customer[customers.length];
		for (int i = 0; i < customers.length; i++) {
			sorted[i] = customers[i];
		}

		for (int i = 0; i < sorted.length; i++) {
			for (int j = i + 1; j < sorted.length; j++) {
				if (sorted[i].getAge() > sorted[j].getAge()) {
					temp = sorted[i];
					sorted[i] = sorted[j];
					sorted[j] = temp;
				}
			}
		}

		for (int m = 0; m < customers.length; m++) {
			displayDetails(sorted, m);
		}

	}

	private static int displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("1.Show All Customer");
		System.out.println("2.create new cutomer");
		System.out.println("3. Show customer by Age in Ascending");
		System.out.println("4.Delete perticular medicine of a Customer");
		System.out.println("5.Exit");

		int n = sc.nextInt();
		return n;
	}

	private static Customer[] createCustomer(Customer[] customers, Medicine[] medicines, boolean isfirstTime) {
		if (!isfirstTime) {
			System.out.print("Enter the no of customer: ");

			noOfPeople = sc.nextInt();
		} else {
			noOfPeople = noOfPeople + 1;
		}
		System.out.println(noOfPeople);
		customers = new Customer[noOfPeople];

		for (int p = 0; p < customers.length; p++) {
			System.out.println("Enter the id:  ");
			int id = sc.nextInt();

			System.out.println("Enter the Name of Customer: ");
			String name = sc.next();

			System.out.println("Enter the age:  ");
			byte age = sc.nextByte();

			System.out.println("Enter the no of medicines:  ");
			byte noOfMed = sc.nextByte();

			medicines = new Medicine[noOfMed];
			float totalBill = 0.0f;

			for (int i = 0; i < noOfMed; i++) {

				System.out.print("Med name " + (i + 1));
				String medName = sc.next();

				System.out.print("Med quantity " + (i + 1));
				int medQua = sc.nextInt();

				System.out.print("Med price " + (i + 1));
				float medPrice = sc.nextFloat();

				totalBill += validateAge(age, medQua, medPrice); 

				medicines[i] = new Medicine();
				medicines[i].setMedName(medName);
				medicines[i].setMedQua(medQua);
				medicines[i].setPrice(medPrice);

				System.out.println("Added....");
			}

			customers[p] = new Customer();
			customers[p].setId(id);
			customers[p].setName(name);
			customers[p].setAge(age);
			customers[p].setNoOfMed(noOfMed);
			customers[p].setTotalBill(totalBill);
			customers[p].setMedicines(medicines);
		}
		return customers;

		
	}

	private static float validateAge(byte age, int medQua, float medPrice) {
	
		float bill = 0; 
		float discount = 0;

		
		if (age >= 60) {
			discount = medPrice * 0.05f;
		}
		// medQua = 20, medPrice = 35
		bill += medQua * (medPrice - discount);
		return bill;
	}

	private static void displayDetails(Customer[] customers, int i) {


		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Id: " + customers[i].getId());
		System.out.println("Name: " + customers[i].getName());
		System.out.println("Age: " + customers[i].getAge());

		for (int j = 0; j < customers[i].getMedicines().length; j++) {
			System.out.println("Medicines:  " + customers[i].getMedicines()[j].getMedName() + "        "
					+ customers[i].getMedicines()[j].getMedQua() + "        "
					+ customers[i].getMedicines()[j].getPrice());
		}

		System.out.println("Total Bill:  " + customers[i].getTotalBill());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
